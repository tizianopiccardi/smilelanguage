package smile;


import java.io.File;
import java.io.PushbackReader;
import java.io.StringReader;

import org.apache.commons.io.FileUtils;

import smile.parser.*;
import smile.lexer.*;
import smile.analysis.*;
import smile.node.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
	
		if (args.length < 1) throw new RuntimeException("Specifica il file");
		
		try {
			File fileRef = new File(args[0]);
			s = FileUtils.readFileToString(fileRef);
		} catch (Exception e) {
			System.out.println("Il file " + args[0] + " non esiste...");
			throw new RuntimeException("Runtime Error");
		}
		
		//s = ":-@";
		Engine pe = new Engine();
		
		try {
			System.out.println("");
			//System.out.println("Motore interprete avviato:");

			Parser p = new Parser(new Lexer(new PushbackReader(new StringReader(s))));

			Start tree = p.parse();
			tree.apply(pe);

			//System.out.println(pe.patternEnv.applyPattern(tmp));

			System.out.println("\n");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		
	}

}
