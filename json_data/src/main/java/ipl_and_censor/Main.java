package ipl_and_censor;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

public class Main {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		String jsonFile ="C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\ipl_and_censor\\ipl.json";
		String csvFile  ="C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\ipl_and_censor\\ipl.csv";
		String outputCsvFile ="C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\ipl_and_censor\\iplOutput.csv";
		String outputJsonFile = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\ipl_and_censor\\iplOutput.json";
		ReadWrite.readWriteJson(jsonFile,outputJsonFile);
		ReadWrite.readWriteCsv(csvFile,outputCsvFile);
		System.out.println("successfully executed");
	}

}
