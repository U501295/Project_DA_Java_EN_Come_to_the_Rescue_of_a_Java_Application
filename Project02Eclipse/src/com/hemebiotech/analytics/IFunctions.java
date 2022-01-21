package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public interface IFunctions {

	List<String> inputFetch();

	void setOutput(TreeMap<String, Integer> symptomCount) throws IOException;

	TreeMap<String, Integer> getSymptoms(List<String> result);

}
