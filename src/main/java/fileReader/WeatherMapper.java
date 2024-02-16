package fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import dataClasses.WeatherDataSet;

public class WeatherMapper implements IClassMapper<WeatherDataSet> {

	@Override
	public String GetPath() {
		return "weather.csv";
	}

	@Override
	public List<WeatherDataSet> MapData() throws IOException {
		FileReader filereader = new FileReader(GetPath()); 

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

}
