package list_obj_json;

import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car>car = Arrays.asList(
				new Car("Tesla","Model",2),
				new Car("BMW","T5",3),
				new Car("Fortuner","fortune",5))
				;
		
		String jsonArray = ListToJson.convertToJson(car);
		System.out.println(jsonArray);
	}

}
