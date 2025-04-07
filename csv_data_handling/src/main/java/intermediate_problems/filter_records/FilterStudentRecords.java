package intermediate_problems.filter_records;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilterStudentRecords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the CSV file path:");
        String filePath = input.nextLine();
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] headers = reader.readNext();
            String[] line;

            while((line = reader.readNext()) != null){
                if(Integer.parseInt(line[3]) > 80){
                    System.out.println("ID: " + line[0] + " , Name: "+ line[1] + " , Age: " + line[2] + " , Marks: " + line[3]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
