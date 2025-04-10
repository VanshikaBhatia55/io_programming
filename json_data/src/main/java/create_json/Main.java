package create_json;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Mathematics");
        subjects.add("Physics");
        subjects.add("Computer Science");

        Student student = new Student("Vanshika",23,subjects);
        student.printStudent();

        // Print JSON representation
        System.out.println("JSON: " + student.toJson());
	}

}
