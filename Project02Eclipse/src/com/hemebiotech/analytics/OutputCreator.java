package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

public class OutputCreator implements IOutput {
	public void setOutput(TreeMap<String, Integer> symptomCount) throws IOException {
		try {
			FileWriter fileWriter;

			fileWriter = new FileWriter("result.out");
			BufferedWriter writer = new BufferedWriter(fileWriter);

			Set<String> keys = symptomCount.keySet();

			for (String key : keys) {

				int symptomFrequency = symptomCount.get(key);

				writer.write(
						"Symptom witnessed	:	" + key + "		" + "Number of occurences :		" + symptomFrequency);
				writer.newLine();

			}
			writer.close();
		}

		catch (IOException e) {
			e.printStackTrace();
			throw e;

		}

	}
}
