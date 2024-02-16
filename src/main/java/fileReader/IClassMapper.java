package fileReader;

import java.io.IOException;
import java.util.List;

public interface IClassMapper<T> {
	String GetPath();
	
	List<T> MapData() throws IOException;
}
