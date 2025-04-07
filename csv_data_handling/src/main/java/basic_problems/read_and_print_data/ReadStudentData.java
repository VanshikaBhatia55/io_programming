package basic_problems.read_and_print_data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\basic_problems\\read_and_print_data\\student.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                if (line.trim().startsWith("#")) {
                    continue; // Skip this iteration and move to the next line
                }
                String[] columns = line.split(",");
                System.out.println("Id: " + columns[0] + " , Name: " + columns[1] +" , Age: " + columns[2] + " , Marks: " + columns[3]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
