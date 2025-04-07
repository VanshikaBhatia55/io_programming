package basic_problems.write_data;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteEmployeeData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give .csv file path: ");
        String filePath = input.nextLine();

        try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){
            String[] header = {"ID","Name","Department","Salary"};
            String[] emp1 = {"101", "Vanshika Bhatia", "Finance", "62000"};
            String[] emp2 = {"102", "Harshit Bhatia", "Sales", "58000"};
            String[] emp3 = {"103", "Santosh Bhatia", "Finance", "68000"};
            String[] emp4 = {"104", "Swati Bhatia", "Sales", "52000"};
            String[] emp5 = {"105", "Abhishek Bhatia", "Finance", "69000"};
            String[] emp6 = {"106", "Manas Kakkar", "Sales", "36000"};

            writer.writeNext(header);
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);
            writer.writeNext(emp6);

            System.out.println("CSV file written successfully using OpenCSV!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
