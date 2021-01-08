package com.loosecoupling;

import com.loosecoupling.IoutputGenerator;

public class OutputHelper {
	IoutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	public IoutputGenerator getOutputGenerator() {
		return outputGenerator;
	}

	public void setOutputGenerator(IoutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}

}
