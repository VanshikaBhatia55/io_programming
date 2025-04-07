package intermediate_problems.modify_csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModifySalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the CSV file path:");
        String filePath = input.nextLine();
        System.out.print("Enter the output CSV file path: ");
        String outputFilePath = input.nextLine();

        try (
                CSVReader reader = new CSVReader(new FileReader(filePath));
                CSVWriter writer = new CSVWriter(new FileWriter(outputFilePath))
        ) {
            String[] headers = reader.readNext();
            writer.writeNext(headers);
            String[] line;
            while((line = reader.readNext()) != null){
                if(line[2].equals("IT")){
                    double salary = Double.parseDouble(line[3]);
                    salary *= 1.10;
                    line[3] = String.format("%.2f" , salary);
                    writer.writeNext(line);
                }
            }
            System.out.println("Salary update completed successfully!");
        }catch (IOException e){
            e.printStackTrace();
        }catch (CsvValidationException e){
            throw new RuntimeException(e);
        }
    }
}
