package de.exxcellent.challenge;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dataClasses.FootballDataSet;
import dataClasses.WeatherDataSet;

public class DataAnalyzer {
	
	
	public FootballDataSet GetSmallestGoalSpread(List<FootballDataSet> listOfFootballDataSet)
	{
		Comparator<FootballDataSet> comp = (FootballDataSet a, FootballDataSet b) -> {
		    Integer rangeA = a.getAllowedGoals() - a.getGoals();
		    Integer rangeB = b.getAllowedGoals() - b.getGoals();
		    return rangeA.compareTo(rangeB);   
		};
		
		return Collections.min(listOfFootballDataSet, comp);		
	}
	
	public WeatherDataSet GetSmallestTemperatureSpread(List<WeatherDataSet> listOfTemperatureDataSet)
	{
		Comparator<WeatherDataSet> comp = (WeatherDataSet a, WeatherDataSet b) -> {
			Double rangeA = a.getMaxTemperature() - a.MinTemperature();
		    Double rangeB = b.getMaxTemperature() - b.MinTemperature();
		    return rangeA.compareTo(rangeB);   
		};
		
		return Collections.min(listOfTemperatureDataSet, comp);	
	}

}
