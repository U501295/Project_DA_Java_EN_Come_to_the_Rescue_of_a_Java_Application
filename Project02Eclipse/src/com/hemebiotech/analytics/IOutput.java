package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

public interface IOutput {

	void setOutput(TreeMap<String, Integer> symptomCount) throws IOException;

}
