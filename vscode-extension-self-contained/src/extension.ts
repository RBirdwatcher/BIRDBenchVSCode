'use strict';

import * as path from 'path';
import * as os from 'os';

import {Trace} from 'vscode-jsonrpc';
import { commands, window, workspace, ExtensionContext, Uri } from 'vscode';
import { LanguageClient, LanguageClientOptions, ServerOptions } from 'vscode-languageclient/node';

let lc: LanguageClient;

export function activate(context: ExtensionContext) {
    // The server is a locally installed in src/mydsl
    let launcher = os.platform() === 'win32' ? 'Regdna-standalone.bat' : 'Regdna-standalone';
    let script = context.asAbsolutePath(path.join('src', 'Regdna', 'bin', launcher));

    let serverOptions: ServerOptions = {
        run : { command: script },
        debug: { command: script, args: [], options: { env: createDebugEnv() } }
    };
    
    let clientOptions: LanguageClientOptions = {
        documentSelector: ['Regdna'],
        synchronize: {
            fileEvents: workspace.createFileSystemWatcher('**/*.*')
        }
    };
    
    // Create the language client and start the client.
    lc = new LanguageClient('Xtext Server', serverOptions, clientOptions);
    
    var disposable2 =commands.registerCommand("Regdna.a.proxy", async () => {
        let activeEditor = window.activeTextEditor;
        if (!activeEditor || !activeEditor.document || activeEditor.document.languageId !== 'Regdna') {
            return;
        }

        if (activeEditor.document.uri instanceof Uri) {
            commands.executeCommand("Regdna.a", activeEditor.document.uri.toString());
        }
    })
    context.subscriptions.push(disposable2);
    
    // enable tracing (.Off, .Messages, Verbose)
    lc.setTrace(Trace.Verbose);
    lc.start();
}
export function deactivate() {
    return lc.stop();
}
function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS:"-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env)
}