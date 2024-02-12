package org.eclipse.efbt.regdna.dsl.ide;

import org.eclipse.xtext.ide.editor.quickfix.AbstractDeclarativeIdeQuickfixProvider;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolutionAcceptor;
import org.eclipse.xtext.ide.editor.quickfix.QuickFix;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.efbt.regdna.dsl.validation.RegdnaValidator;

public class RegdnaIdeQuickfixProvider extends AbstractDeclarativeIdeQuickfixProvider {
	/** 
	@QuickFix(RegdnaValidator.INVALID_NAME)
	public void textFixLowerCaseName(DiagnosticResolutionAcceptor acceptor) {
		acceptor.accept("Capitalize Name",  (diagnostic, obj, document) -> {
			return createTextEdit(diagnostic, StringExtensions.toFirstUpper(document.getSubstring(diagnostic.getRange())));
		}
			
		);
	} */

}
