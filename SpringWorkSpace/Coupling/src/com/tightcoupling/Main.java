/*
 * output is coupled to Csvoutput generator, every change of output generator may involve code change 
*/

package com.tightcoupling;

public class Main {
	public static void main(String[] args) {
		IoutputGenerator output = new CsvOutputGenerator();
		output.generateOutput();

//		IoutputGenerator output = new JsonOutputGenerator();
//		output.generateOutput();
	}
}
