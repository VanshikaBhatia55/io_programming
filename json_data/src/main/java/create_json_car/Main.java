package create_json_car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Toyota", "ANYTHING", 2022);
        System.out.println("Car in JSON format: " + car.toJson());
	}

}
