package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * @author JULIEN BARONI, intern
 * @version 2.0
 * 
 * @Description_of_the_Class Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * Used to list symptoms
	 */
	@Override
	public TreeMap<String, Integer> getSymptoms(List<String> symptoms) {
		TreeMap<String, Integer> symptomCount = new TreeMap<String, Integer>();
		final int startIterator = 1;

		for (String symptom : symptoms) {
			// rajouter les conditions si input respecte pas la casse
			final String constanteSymptom = symptom;
			if (symptomCount.containsKey(constanteSymptom)) {
				symptomCount.put(constanteSymptom, symptomCount.get(constanteSymptom) + 1);
			} else {
				symptomCount.put(constanteSymptom, startIterator);
			}

		}

		return symptomCount;
	}

}
