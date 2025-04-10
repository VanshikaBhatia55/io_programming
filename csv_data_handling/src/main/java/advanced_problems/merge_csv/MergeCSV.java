package advanced_problems.merge_csv;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\merge_csv\\students1.csv";
        String file2 = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\merge_csv\\students2.csv";
        String outputFile = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\merge_csv\\merged_students.csv";

        Map<String, String[]> studentData1 = new HashMap<>();

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        ) {
            String line;

            String header1 = br1.readLine();
            while ((line = br1.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String id = parts[0];
                    studentData1.put(id, new String[]{parts[1], parts[2]});
                }
            }

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            String header2 = br2.readLine();
            while ((line = br2.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String id = parts[0];
                    String marks = parts[1];
                    String grade = parts[2];

                    if (studentData1.containsKey(id)) {
                        String[] info = studentData1.get(id);
                        bw.write(id + "," + info[0] + "," + info[1] + "," + marks + "," + grade);
                        bw.newLine();
                    }
                }
            }

            System.out.println("Merged file created");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
