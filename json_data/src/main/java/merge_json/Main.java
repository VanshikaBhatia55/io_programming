package merge_json;

import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "Vinshu");
		obj1.put("age", "21");
		JSONObject obj2 = new JSONObject();
		obj2.put("age", 23);
		
		JSONObject merged = JSONMerger.merge(obj1, obj2);

        System.out.println("Merged JSON: " + merged.toString());
	}

}
