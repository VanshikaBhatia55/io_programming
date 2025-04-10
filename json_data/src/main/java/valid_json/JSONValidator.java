package valid_json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONValidator {
    public static boolean isValidJson(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readTree(jsonString);  // Parsing to check validity
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidStructure(String jsonString, Class<?> clazz) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readValue(jsonString, clazz);  // Attempt to map to the class
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}