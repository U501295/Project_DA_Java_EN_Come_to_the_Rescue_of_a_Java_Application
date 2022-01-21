package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * @author JULIEN BARONI, intern
 * @version 2.0
 * 
 * 
 * @Description_of_the_Interface Description of the functions which will permit
 *                               to fetch and process the file containing the
 *                               symptoms, then to produce and write the count
 *                               of them
 * 
 */
public interface IFunctions {
	/**
	 * @input_params Any type of data source, indicated by its path
	 * @return A raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable.If no data is available, returns a
	 *         NullPointerException
	 */
	List<String> getSymptomsFile(String inputPath) throws IOException, FileNotFoundException, NullPointerException;

	/**
	 * 
	 * @input_params A listing of all Symptoms
	 * @return An alphabetically arranged dataset with each symptom and its
	 *         frequency
	 */
	TreeMap<String, Integer> analyseDataFromSymptomsFile(List<String> rawSymptomsList)
			throws ClassCastException, NullPointerException;

	/**
	 * 
	 * @input_params A symptoms/frequency dataset
	 * @return result.out
	 * 
	 */
	void writeSymptomsCount(TreeMap<String, Integer> symptomCount)
			throws IOException, ClassCastException, NullPointerException;

}
