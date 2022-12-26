const {AutoLanguageClient} = require('atom-languageclient');
const cp = require('child_process');
const os = require("os");
const path = require("path");
class OpenRegSpecsLanguageClient extends AutoLanguageClient {
    getGrammarScopes() {
        return ['source.OpenRegSpecs']
    }
 
    getLanguageName() {
        return 'OpenRegSpecs (Xtext)'
    }
 
    getServerName() {
        return 'OpenRegSpecs (Xtext) Language Server'
    }
 
    startServerProcess(projectPath) {
        const serverHome = path.join(__dirname, 'OpenRegSpecs');
        const args = [];
        let launcher = os.platform() === 'win32' ? 'OpenRegSpecs-standalone.bat' : 'OpenRegSpecs-standalone';
        let script = path.join(__dirname, 'OpenRegSpecs', 'bin', launcher)
        const childProcess = cp.spawn(script, args,{ cwd: serverHome });
        this.captureServerErrors(childProcess);
        childProcess.on('close', exitCode => {
            if (!childProcess.killed) {
                atom.notifications.addError('IDE-OpenRegSpecs language server stopped unexpectedly.', {
                    dismissable: true,
                    description: this.processStdErr ? `<code>${this.processStdErr}</code>` : `Exit code ${exitCode}`
                })
            }
        });
        return childProcess;
    }
}
 
module.exports = new OpenRegSpecsLanguageClient();