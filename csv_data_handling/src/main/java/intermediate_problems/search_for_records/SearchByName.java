package intermediate_problems.search_for_records;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchByName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the CSV file path:");
        String filePath = input.nextLine();
        System.out.print("Enter name to search:");
        String Name = input.nextLine();

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] line;
            while((line = reader.readNext()) != null){
                if(line[1].equals(Name)){
                    System.out.println("Department of " + Name + " : " + line[2]);
                    System.out.println("Salary of " + Name + " : " + line[3]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (CsvValidationException e){
            throw new RuntimeException(e);
        }
    }
}
