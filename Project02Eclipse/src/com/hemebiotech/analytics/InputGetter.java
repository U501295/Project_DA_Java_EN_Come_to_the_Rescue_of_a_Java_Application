package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputGetter implements IFetch {

	private String inputPath;

	public InputGetter(String inputPath) {
		this.inputPath = inputPath;
	}

	@Override
	public List<String> inputFetch() {

		List<String> result = new ArrayList<String>();

		if (inputPath != null) {
			try {
				BufferedReader inputReader = new BufferedReader(new FileReader(inputPath));
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
