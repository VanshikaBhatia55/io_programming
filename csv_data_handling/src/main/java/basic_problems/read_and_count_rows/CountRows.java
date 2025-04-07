package basic_problems.read_and_count_rows;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountRows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give .csv file path: ");
        String filePath = input.nextLine();
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            reader.skip(1);
            String[] line;
            int count = 0;
            while((line = reader.readNext()) != null){
                count++;
            }
            System.out.println(count);
        }catch (IOException e){
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
