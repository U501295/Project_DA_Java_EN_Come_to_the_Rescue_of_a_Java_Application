package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class RefactoredAnalyticsCounter implements IFunctions {

	private String inputPath;

	public RefactoredAnalyticsCounter(String inputPath) {
		this.inputPath = inputPath;
	}

	@Override
	public List<String> inputFetch() {
		List<String> inputContent = new ArrayList<String>();

		if (inputPath != null) {
			try {
				BufferedReader inputReader = new BufferedReader(new FileReader(inputPath));
				String readedLine = inputReader.readLine();

				while (readedLine != null) {
					inputContent.add(readedLine);
					readedLine = inputReader.readLine();
				}
				inputReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return inputContent;
	}

	@Override
	public TreeMap<String, Integer> getSymptoms(List<String> inputContent) {
		TreeMap<String, Integer> symptomsInfo = new TreeMap<String, Integer>();
		final int symptomFrequency = 1;

		for (String symptom : inputContent) {
			// rajouter les conditions si input respecte pas la casse
			final String symptomName = symptom;
			if (symptomsInfo.containsKey(symptomName)) {
				symptomsInfo.put(symptomName, symptomsInfo.get(symptomName) + 1);
			} else {
				symptomsInfo.put(symptomName, symptomFrequency);
			}

		}

		return symptomsInfo;
	}

	@Override
	public void setOutput(TreeMap<String, Integer> symptomsInfo) throws IOException {
		try {
			FileWriter fileWriter = new FileWriter("result.out");

			BufferedWriter outputWriter = new BufferedWriter(fileWriter);

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
			outputWriter.close();
		}

		catch (IOException e) {
			e.printStackTrace();
			throw e;

		}

	}

}
