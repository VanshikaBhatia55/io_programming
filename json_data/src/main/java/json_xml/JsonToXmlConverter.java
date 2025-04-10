package json_xml;
import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlConverter {

    public static void main(String[] args) {
        // Manually create a JSON string
        String jsonString = """
        {
            "name": "Alice",
            "age": 30,
            "city": "New York"
        }
        """;

        try {
            // Convert JSON string to JSONObject
            JSONObject jsonObject = new JSONObject(jsonString);

            // Convert JSONObject to XML string
            String xmlContent = XML.toString(jsonObject, "root");

            // Print the converted XML
            System.out.println("Converted XML:");
            System.out.println(xmlContent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

