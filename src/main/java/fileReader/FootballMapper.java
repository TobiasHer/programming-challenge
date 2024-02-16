package fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import dataClasses.FootballDataSet;

public class FootballMapper implements IClassMapper<FootballDataSet> {

	@Override
	public List<FootballDataSet> MapData() throws IOException {
		FileReader filereader = new FileReader(GetPath()); 

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

	@Override
	public String GetPath() {
		return "football.csv";
	}

}
