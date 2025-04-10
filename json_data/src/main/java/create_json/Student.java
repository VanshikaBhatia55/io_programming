package create_json;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Student {
	private String name;
	private int age;
	private ArrayList<String>subjects;
	
	public Student(String name,int age,ArrayList<String>subjects) {
		this.name = name;
		this.age = age;
		this.subjects = subjects;
	}
	//Print student details
    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subjects: " + subjects);
    }
    
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public ArrayList<String> getSubjects(){
    	return subjects;
    }
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
