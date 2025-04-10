package advanced_problems.detect_duplicate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class DetectDuplicate {
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\detect_duplicate\\employees.csv";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            HashMap<String, Integer> map = new HashMap<>();
            while((line = br.readLine()) != null){
                String columns[] = line.split(",");
                if(map.containsKey(columns[0])){
                    System.out.println(columns[0] + ", " + columns[1] + ", " + columns[2] + ", " + columns[3]);
                }
                map.put(columns[0], 1);
            }
        }
    }
}
