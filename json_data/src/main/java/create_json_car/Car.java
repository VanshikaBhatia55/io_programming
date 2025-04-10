package create_json_car;

import com.google.gson.Gson;

public class Car {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public String getBrand() {
    	return brand;
    }
    
    public String getModel() {
    	return model;
    }
    public int getYear() {
    	return year;
    }
    // Convert to JSON using Gson
    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
