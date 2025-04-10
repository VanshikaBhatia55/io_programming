package advanced_problems.json_csv_converter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonCsvConverter {
    public static void jsonToCsv(String jsonFile, String csvFile) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = mapper.readValue(new File(jsonFile), new TypeReference<List<Student>>() {});

        try(CSVWriter writer = new CSVWriter(new FileWriter(csvFile))){
            writer.writeNext(new String[]{"id", "name", "age"});

            for (Student s : students){
                writer.writeNext(new String[]{
                        String.valueOf(s.id),
                        s.name,
                        String.valueOf(s.age)
                });
            }
        }
        System.out.println("Converted JSON to CSV: " + csvFile);
    }

    public static void csvToJson(String csvFile, String jsonFile) throws Exception {
        List<Student> students = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            reader.readNext(); // skip header
            while ((nextLine = reader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                int age = Integer.parseInt(nextLine[2]);
                students.add(new Student(id, name, age));
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), students);

        System.out.println("Converted CSV to JSON: " + jsonFile);
    }

    public static void main(String[] args) throws Exception {
        String jsonInput = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\json_csv_converter\\students.json";
        String csvOutput = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\json_csv_converter\\students.csv";
        String jsonOutput = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\json_csv_converter\\converted_to_json.json";

        jsonToCsv(jsonInput, csvOutput);
        csvToJson(csvOutput, jsonOutput);
    }
}
