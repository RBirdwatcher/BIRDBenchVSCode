const {AutoLanguageClient} = require('atom-languageclient');
const cp = require('child_process');
const os = require("os");
const path = require("path");
class Ecore4RegLanguageClient extends AutoLanguageClient {
    getGrammarScopes() {
        return ['source.Ecore4Reg']
    }
 
    getLanguageName() {
        return 'Ecore4Reg (Xtext)'
    }
 
    getServerName() {
        return 'Ecore4Reg (Xtext) Language Server'
    }
 
    startServerProcess(projectPath) {
        const serverHome = path.join(__dirname, 'Ecore4Reg');
        const args = [];
        let launcher = os.platform() === 'win32' ? 'Ecore4Reg-standalone.bat' : 'Ecore4Reg-standalone';
        let script = path.join(__dirname, 'Ecore4Reg', 'bin', launcher)
        const childProcess = cp.spawn(script, args,{ cwd: serverHome });
        this.captureServerErrors(childProcess);
        childProcess.on('close', exitCode => {
            if (!childProcess.killed) {
                atom.notifications.addError('IDE-Ecore4Reg language server stopped unexpectedly.', {
                    dismissable: true,
                    description: this.processStdErr ? `<code>${this.processStdErr}</code>` : `Exit code ${exitCode}`
                })
            }
        });
        return childProcess;
    }
}
 
module.exports = new Ecore4RegLanguageClient();