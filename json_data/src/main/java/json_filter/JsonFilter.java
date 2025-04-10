package json_filter;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFilter {
	public static String filterByAge(String jsonArray,int thresold) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			List<Person>persons=objectMapper.readValue(jsonArray,new TypeReference<List<Person>>(){});
			List<Person>filter = persons.stream().filter(person -> person.getAge()>thresold).collect(Collectors.toList());
			return objectMapper.writeValueAsString(filter);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
