/*
 * generated by Xtext
 */
package de.fraunhofer.iem.reqpat.demo.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ReqPatDemoAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/fraunhofer/iem/reqpat/demo/parser/antlr/internal/InternalReqPatDemo.tokens");
	}
}