package com.hemebiotech.analytics;

/**
 * @author JULIEN BARONI, intern
 * @version 2.0
 * @input_params list of symptoms --> symptoms.txt
 * @return alphabetically ordered, with a count of every symptom --> result.out
 * 
 * 
 */

public class AnalyticsCounter {
	/*
	 * private static int headacheCount = 0; private static int rashCount = 0;
	 * private static int pupilCount = 0;
	 */

	public static void main(String args[]) throws Exception {

		/*
		 * String symptomsDocumentPath =
		 * "C:\\Users\\S647648\\Onedrive - AXA\\Bureau\\TECH\\methodo_dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"
		 * ; BufferedReader inputReader = new BufferedReader(new
		 * FileReader(symptomsDocumentPath)); String readedLine =
		 * inputReader.readLine(); int iterator = 0; int headCount = 0;
		 * 
		 * while (readedLine != null) { iterator++;
		 * System.out.println("symptom from file: " + readedLine); if
		 * (readedLine.equals("headache")) { headCount++;
		 * System.out.println("number of headaches: " + headCount); } else if
		 * (readedLine.equals("rush")) { rashCount++; } else if
		 * (readedLine.contains("pupils")) { pupilCount++; }
		 * 
		 * readedLine = inputReader.readLine(); }
		 * 
		 * inputReader.close();
		 * 
		 * FileWriter writer = new FileWriter("result.out"); writer.write("headache: " +
		 * headacheCount + "\n"); writer.write("rash: " + rashCount + "\n");
		 * writer.write("dialated pupils: " + pupilCount + "\n"); writer.close();
		 */

		/*
		 * InputGetter symptomFile = new InputGetter(
		 * "C:\\Users\\S647648\\Onedrive - AXA\\Bureau\\TECH\\methodo_dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"
		 * ); List<String> symptomList = symptomFile.inputFetch();
		 * System.out.println(symptomList); ReadSymptomDataFromFile reader = new
		 * ReadSymptomDataFromFile(); TreeMap<String, Integer> symptomOutput =
		 * reader.getSymptoms(symptomList); System.out.println(symptomOutput);
		 * OutputCreator output = new OutputCreator(); output.setOutput(symptomOutput);
		 */

		RefactoredAnalyticsCounter action = new RefactoredAnalyticsCounter(
				"C:\\Users\\S647648\\Onedrive - AXA\\Bureau\\TECH\\methodo_dev\\Projet_2\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		action.setOutput(action.getSymptoms(action.inputFetch()));

	}
}
