package object_json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.List;

public class ListToJsonConverter {

    public static String convertListToJson(List<Person> personList) {
        try {
        	if(personList==null) {
        		return null;
        	}
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);  // Pretty print
            return objectMapper.writeValueAsString(personList);       // Convert list to JSON
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
