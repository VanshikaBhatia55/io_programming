package read_print;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;



public class JsonProcessor {
	public static Map<String,Object> getJsonData(String filePath)throws Exception{
		Map<String,Object>hm = new HashMap<>();
		
		String content = new String(Files.readAllBytes(Paths.get(filePath)));
		
		JSONObject jsonObject = new JSONObject(content);
		
		for(String key:jsonObject.keySet())
		{
			hm.put(key, jsonObject.get(key));
		}
		return hm;
	}
}
