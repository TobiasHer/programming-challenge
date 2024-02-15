package de.exxcellent.challenge;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class CSVClassMapper {	
	
	static String footballCSVpath = "C:\\Users\\Tobias\\eclipse-workspace\\programming-challenge\\bin\\src\\main\\resources\\de\\exxcellent\\challenge\\football.csv";
		
	static String weatherCSVpath = "C:\\Users\\Tobias\\eclipse-workspace\\programming-challenge\\bin\\src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";
		
	public static List<WeatherDataSet> MapWeatherCSV() throws IOException
	{
		FileReader filereader = new FileReader(weatherCSVpath); 

        CSVReader csvReader = new CSVReader(filereader);
        		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Day", "Day");
		map.put("MxT", "MaxTemperature");
		map.put("MnT", "MinTemperature");
		map.put("AvT", "AverageTemperature");
		
		HeaderColumnNameTranslateMappingStrategy<WeatherDataSet> translator =
	             new HeaderColumnNameTranslateMappingStrategy<WeatherDataSet>();
		
	        translator.setType(WeatherDataSet.class);
	        translator.setColumnMapping(map);
	        
	    CsvToBean csvToBean = new CsvToBean();
	    
		List<WeatherDataSet> allWeatherData = csvToBean.parse(translator, csvReader);
		
		filereader.close();
		csvReader.close();
		
		return allWeatherData;	    		
	}
	
	public static List<FootballDataSet> MapFootballCSV() throws IOException
	{
		FileReader filereader = new FileReader(footballCSVpath); 

        CSVReader csvReader = new CSVReader(filereader);
        		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Team", "team");
		map.put("Games", "games");
		map.put("Wins", "wins");
		map.put("Losses", "losses");
		map.put("Draws", "draws");
		map.put("Goals", "goals");
		map.put("Goals Allowed", "allowedGoals");
		map.put("Points", "points");
				
		HeaderColumnNameTranslateMappingStrategy<FootballDataSet> translator =
	             new HeaderColumnNameTranslateMappingStrategy<FootballDataSet>();
		
	        translator.setType(FootballDataSet.class);
	        translator.setColumnMapping(map);
	        
	    CsvToBean csvToBean = new CsvToBean();
	    
		List<FootballDataSet> allFootballData = csvToBean.parse(translator, csvReader);
		
		filereader.close();
		csvReader.close();
		
		return allFootballData;	    
		
	}			
}
