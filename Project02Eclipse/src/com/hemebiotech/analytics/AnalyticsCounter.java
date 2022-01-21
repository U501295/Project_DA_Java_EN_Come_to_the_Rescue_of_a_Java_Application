package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author JULIEN BARONI, intern
 * @version 2.0
 * @input_params list of symptoms --> symptoms.txt
 * @return alphabetically ordered, with a count of each symptom --> result.out
 * 
 * 
 */

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		String inputPath = "C:\\Users\\S647648\\Onedrive - AXA\\Bureau\\TECH\\methodo_dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";
		RefactoredAnalyticsCounter action = new RefactoredAnalyticsCounter();
		try {
			action.writeSymptomsCount(action.analyseDataFromSymptomsFile(action.getSymptomsFile(inputPath)));
		} catch (FileNotFoundException h) {
			System.out.println("ERROR : The input file's path does not exist");
			throw h;
		} catch (IOException e) {
			System.out.println("ERROR : An incident occured while the input file's content was being processed");
			throw e;
		} catch (ClassCastException f) {
			System.out.println(
					"ERROR : The input file's content doesn't follow the format rules (one line per symptom, written in lowcase; without special symbols or numbers)"
							+ ", or is empty");
			throw f;
		} catch (NullPointerException g) {
			System.out.println("ERROR : The input file's content is empty or doesn't contain symptoms' names");
			throw g;

		}

	}
}
