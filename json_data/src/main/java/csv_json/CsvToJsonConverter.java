package csv_json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CsvToJsonConverter {

    public static void main(String[] args) {
        String[] headers = {"name", "age", "city"};
        String[][] rows = {
            {"Alice", "30", "New York"},
            {"Bob", "25", "Los Angeles"},
            {"Charlie", "35", "Chicago"}
        };

        try {
            List<Map<String, String>> jsonList = new ArrayList<>();

            for (String[] row : rows) {
                Map<String, String> jsonObject = new java.util.LinkedHashMap<>();
                for (int j = 0; j < headers.length; j++) {
                    jsonObject.put(headers[j], row[j]);
                }
                jsonList.add(jsonObject);
            }

            // Convert to JSON using Jackson
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonResult = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonList);

            // Print the converted JSON
            System.out.println("Converted JSON:");
            System.out.println(jsonResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
