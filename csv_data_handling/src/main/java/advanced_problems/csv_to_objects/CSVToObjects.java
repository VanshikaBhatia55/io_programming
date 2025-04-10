package advanced_problems.csv_to_objects;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class CSVToObjects {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\csv_data_handling\\src\\main\\java\\advanced_problems\\csv_to_objects\\employee.csv";
        try {
            FileReader reader = new FileReader(filePath);
            CsvToBean<Employee> csvToBean = new CsvToBeanBuilder<Employee>(reader)
                    .withType(Employee.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Employee> employees = csvToBean.parse();
            for(Employee emp : employees){
                System.out.println(emp.getName() + " works in " + emp.getDepartment());
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
