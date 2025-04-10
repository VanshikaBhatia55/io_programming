package json_filter;

public class Main {
    public static void main(String[] args) {
        // Example JSON array
        String jsonArray =
       """
       		 [
            {"name": "Alice", "age": 25},
            {"name": "Bob", "age": 30},
            {"name": "Charlie", "age": 28},
            {"name": "David", "age": 22}
        ]"""
        ;

        // Filter records where age > 25
        String filteredJson = JsonFilter.filterByAge(jsonArray, 25);

        // Print the filtered JSON array
        System.out.println("Filtered JSON:");
        System.out.println(filteredJson);
    }
}

