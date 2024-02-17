package de.exxcellent.challenge;

import java.util.List;
import dataClasses.FootballDataSet;
import dataClasses.WeatherDataSet;
import fileReader.FootballMapper;
import fileReader.WeatherMapper;
import java.io.*;

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
	public static int GetSmallestTemperatureSpread() throws IOException {
		WeatherMapper weatherMapper = new WeatherMapper();
		List<WeatherDataSet> allWeatherData = weatherMapper.MapData();
		DataAnalyzer dataAnalyzer = new DataAnalyzer();
		WeatherDataSet smallestTemperatureSpread = dataAnalyzer.GetSmallestTemperatureSpread(allWeatherData);
		return smallestTemperatureSpread.getDay();
	}

	public static String GetSmallestGoalSpread() throws IOException {
		FootballMapper footballMapper = new FootballMapper();
		List<FootballDataSet> allFootballData = footballMapper.MapData();
		DataAnalyzer dataAnalyzer = new DataAnalyzer();
		FootballDataSet smallestGoalSpread = dataAnalyzer.GetSmallestGoalSpread(allFootballData);
		return smallestGoalSpread.getTeam();

	}

	public static void main(String... args) {

		// Your preparation code …

		try {
			System.out.printf("Day with smallest temperature spread : %s%n", GetSmallestTemperatureSpread());
			System.out.printf("Team with smallest goal spread       : %s%n", GetSmallestGoalSpread());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
