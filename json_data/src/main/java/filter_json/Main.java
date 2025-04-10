package filter_json;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
	public static void main(String[]args) throws JsonProcessingException{
		List<User>user = Arrays.asList(new User("Vanshika",37),new User("Aman",26),new User("Divyansh",24));
		String jsonArray = JsonConverter.convertJson(user);
		
		//System.out.print(jsonArray);  
		int conditionalAge = 25;  	
		String filter = JsonFilter.filterData(jsonArray,conditionalAge);
		System.out.println(filter);
	}
}
