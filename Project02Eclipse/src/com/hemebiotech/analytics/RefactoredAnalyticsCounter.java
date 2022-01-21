package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class RefactoredAnalyticsCounter implements IFunctions {

	@Override
	public List<String> getSymptomsFile(String inputPath)
			throws IOException, FileNotFoundException, NullPointerException {
		List<String> inputContent = new ArrayList<String>();
		BufferedReader inputReader = new BufferedReader(new FileReader(inputPath));
		try {
			String readedLine = inputReader.readLine();
			if (readedLine == null) {
				throw new NullPointerException();
			}
			while (readedLine != null) {
				inputContent.add(readedLine);
				readedLine = inputReader.readLine();
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException f) {
			throw f;
		} finally {
			inputReader.close();
		}
		return inputContent;
	}

	@Override
	public TreeMap<String, Integer> analyseDataFromSymptomsFile(List<String> inputContent)
			throws ClassCastException, NullPointerException {
		TreeMap<String, Integer> symptomsInfo = new TreeMap<String, Integer>();
		final int symptomFrequency = 1;
		try {
			for (String symptom : inputContent) {
				final String symptomName = symptom.toLowerCase();
				if (symptomsInfo.containsKey(symptomName)) {
					symptomsInfo.put(symptomName, symptomsInfo.get(symptomName) + 1);
				} else {
					symptomsInfo.put(symptomName, symptomFrequency);
				}
			}
		} catch (ClassCastException e) {
			throw e;
		} catch (NullPointerException f) {
			throw f;
		}
		return symptomsInfo;

	}

	@Override
	public void writeSymptomsCount(TreeMap<String, Integer> symptomsInfo)
			throws IOException, ClassCastException, NullPointerException {
		FileWriter fileWriter = new FileWriter("result.out");
		BufferedWriter outputWriter = new BufferedWriter(fileWriter);
		try {
			Set<String> symptomsNames = symptomsInfo.keySet();
			for (String symptomName : symptomsNames) {
				int symptomFrequency = symptomsInfo.get(symptomName);
				outputWriter.write("Symptom witnessed	:	" + symptomName + "\n" + "Number of occurences :		"
						+ symptomFrequency);
				outputWriter.newLine();
				outputWriter.write(
						"---------------------------------------------------------------------------------------------");
				outputWriter.newLine();
			}
		} catch (IOException e) {
			throw e;
		} catch (ClassCastException f) {
			throw f;
		} catch (NullPointerException g) {
			throw g;
		} finally {
			outputWriter.close();
		}
	}

}
