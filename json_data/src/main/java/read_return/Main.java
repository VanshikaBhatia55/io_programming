package read_return;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\LENOVO\\Desktop\\bridgelabz-workspace\\io_programming\\json_data\\src\\main\\java\\read_return\\user.json";
		 User user = JsonReader.readAndExtractField(filePath);
	        System.out.println("Name: " + user.getName());
	        System.out.println("Email: " + user.getEmail());
	}

}
