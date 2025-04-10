package advanced_problems.csv_from_database;

import java.io.*;

public class CSVFromDatabase {
    public static void main(String[] args) {
        String employeesPath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\csv_from_database\\employee";
        String csvEmployeesPath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\csv_from_database\\employee.csv";
        try(BufferedReader reader = new BufferedReader(new FileReader(employeesPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvEmployeesPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null){
                String[] columns = line.split(",");
                writer.write(columns[0]+","+columns[1]+","+columns[2]+","+columns[3] + "\n");
            }
            System.out.println("new csv file updated successfully");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
