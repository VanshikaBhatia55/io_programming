package advanced_problems.validate_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidateCSV {
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\validate_csv\\student_details.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            br.readLine();
            while((line = br.readLine())!=null){
                 String[] columns = line.split(",");
                 if(!columns[2].matches("\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}")){
                     System.out.println("Invalid Email for: "+ columns[1]);
                 }
                 else if(!columns[3].matches("\\d{10}")){
                    System.out.println("Invalid Number for: " + columns[1]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
