package list_obj_json;

import java.util.List;


import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJson {
    public static String convertToJson(List<Car> li) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(li);
            return jsonString;
        } catch (Exception e) {
            System.err.println("Error converting list to JSON: " + e.getMessage());
            return null;
        }
    }
}

