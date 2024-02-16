package dataClasses;

public class WeatherDataSet {
	private int Day;
	private double MaxTemperature, MinTemperature, AverageTemperature;
	
	public int getDay()
	{
		return Day;
	}
	
	public void setDay(int day)
	{
		Day = day;
	}
	
	public double getMaxTemperature()
	{
		return MaxTemperature;
	}
	
	public void setMaxTemperature(double maxTemperature)
	{
		MaxTemperature = maxTemperature;
	}
	
	public double MinTemperature()
	{
		return MinTemperature;
	}
	
	public void setMinTemperature(double minTemperature)
	{
		MinTemperature = minTemperature;
	}
	
	public double AverageTemperature()
	{
		return AverageTemperature;
	}
	
	public void setAverageTemperature(double averageTemperature)
	{
		AverageTemperature = averageTemperature;
	}
	
	@Override 
	public String toString()
	{
		return "WeatherDataSet [Day=" + Day + ", MaxTemperature=" + MaxTemperature + ", MinTemperature=" + MinTemperature + ", AverageTemperature=" + AverageTemperature + "]";
	}
}
