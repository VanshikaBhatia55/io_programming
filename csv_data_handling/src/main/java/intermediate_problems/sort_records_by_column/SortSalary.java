package intermediate_problems.sort_records_by_column;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortSalary {
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
            String[] header = reader.readNext();
            writer.writeNext(header);

            ArrayList<String[]> records = new ArrayList<>();
            String[] line;
            while((line = reader.readNext()) != null) {
                records.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (CsvValidationException e){
            throw new RuntimeException(e);
        }
    }
}
