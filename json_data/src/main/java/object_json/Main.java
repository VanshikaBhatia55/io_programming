package object_json;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 28));

        // Convert list to JSON array
        String jsonArray = ListToJsonConverter.convertListToJson(personList);
        
        // Print the JSON array
        System.out.println("JSON Array:");
        System.out.println(jsonArray);
    }
}

