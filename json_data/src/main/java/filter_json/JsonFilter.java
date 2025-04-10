package filter_json;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonFilter {
	public static String filterData(String user,int age) throws JsonMappingException, JsonProcessingException{
		ObjectMapper objectMapper = new ObjectMapper();
		List<User> users = objectMapper.readValue(user, new TypeReference<List<User>>() {});
		List<User>filter = users.stream().filter(u -> u.getAge() > age).collect(Collectors.toList());
		return objectMapper.writeValueAsString(filter);
	}
	
}
