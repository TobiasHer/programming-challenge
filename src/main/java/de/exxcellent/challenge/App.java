package de.exxcellent.challenge;

import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

	/**
	 * This is the main entry method of your program.
	 * 
	 * @param args The CLI arguments passed
	 * @throws IOException 
	 */
	public static void main(String... args) throws IOException {

		// Your preparation code …
		
		try {	
			
	        List<FootballDataSet> allFootballData = CSVClassMapper.MapFootballCSV();
	        List<WeatherDataSet> allWeatherData = CSVClassMapper.MapWeatherCSV();
	        
	        DataAnalyzer dataAnalyzer = new DataAnalyzer();
	        FootballDataSet smallestGoalSpread = dataAnalyzer.GetSmallestGoalSpread(allFootballData);
	        WeatherDataSet smallestTemperatureSpread = dataAnalyzer.GetSmallestTemperatureSpread(allWeatherData);
	        
	        String dayWithSmallestTempSpread = "Someday"; // Your day analysis function call …
			System.out.printf("Day with smallest temperature spread : %s%n", smallestTemperatureSpread.getDay());

			String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
			System.out.printf("Team with smallest goal spread       : %s%n", smallestGoalSpread.getTeam());
	        
            
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
		
}

