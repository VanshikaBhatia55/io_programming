package valid_json;
public class Main {
    public static void main(String[] args) {
        String validJson = "{\"name\":\"Alice\",\"age\":25,\"city\":\"New York\"}";
        String invalidJson = "{\"name\":\"Alice\",\"age\":\"twenty-five\",\"city\":New York}";

        System.out.println("Valid JSON Format: " + JSONValidator.isValidJson(validJson));
        System.out.println("Invalid JSON Format: " + JSONValidator.isValidJson(invalidJson));

        System.out.println("Valid JSON Structure: " + JSONValidator.isValidStructure(validJson, Person.class));
        System.out.println("Invalid JSON Structure: " + JSONValidator.isValidStructure(invalidJson, Person.class));
    }
}
