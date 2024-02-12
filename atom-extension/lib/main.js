const {AutoLanguageClient} = require('atom-languageclient');
const cp = require('child_process');
const os = require("os");
const path = require("path");
class RegdnaLanguageClient extends AutoLanguageClient {
    getGrammarScopes() {
        return ['source.Regdna']
    }
 
    getLanguageName() {
        return 'Regdna (Xtext)'
    }
 
    getServerName() {
        return 'Regdna (Xtext) Language Server'
    }
 
    startServerProcess(projectPath) {
        const serverHome = path.join(__dirname, 'Regdna');
        const args = [];
        let launcher = os.platform() === 'win32' ? 'Regdna-standalone.bat' : 'Regdna-standalone';
        let script = path.join(__dirname, 'Regdna', 'bin', launcher)
        const childProcess = cp.spawn(script, args,{ cwd: serverHome });
        this.captureServerErrors(childProcess);
        childProcess.on('close', exitCode => {
            if (!childProcess.killed) {
                atom.notifications.addError('IDE-Regdna language server stopped unexpectedly.', {
                    dismissable: true,
                    description: this.processStdErr ? `<code>${this.processStdErr}</code>` : `Exit code ${exitCode}`
                })
            }
        });
        return childProcess;
    }
}
 
module.exports = new RegdnaLanguageClient();