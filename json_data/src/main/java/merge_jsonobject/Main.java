package merge_jsonobject;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            JsonNode json1 = objectMapper.readTree(new File(
                "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\merge_jsonobject\\file1.json"));
            JsonNode json2 = objectMapper.readTree(new File(
                "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\merge_jsonobject\\file2.json"));
            
            ObjectNode merged = JsonMerger.mergeJson(json1, json2);
            
            System.out.println("Merged JSON:");
            System.out.println(merged.toPrettyString());
            
            objectMapper.writeValue(new File(
                    "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\merge_jsonobject\\merge.json"), merged);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
