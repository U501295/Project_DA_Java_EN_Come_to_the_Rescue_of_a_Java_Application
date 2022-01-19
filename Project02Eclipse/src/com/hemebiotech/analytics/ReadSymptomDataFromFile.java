package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Caroline Hédot, Technical Director at Heme Biotech/ Code cleaned by
 *         JULIEN BARONI, intern
 * @version 1.0
 * 
 * @Description_of_the_Class Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String symptomsDocumentPath;

	public ReadSymptomDataFromFile(String symptomsDocumentPath) {
		this.symptomsDocumentPath = symptomsDocumentPath;
	}

	/**
	 * Used to list symptoms
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (symptomsDocumentPath != null) {
			try {
				BufferedReader inputReader = new BufferedReader(new FileReader(symptomsDocumentPath));
				String readedLine = inputReader.readLine();

				while (readedLine != null) {
					result.add(readedLine);
					readedLine = inputReader.readLine();
				}
				inputReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
