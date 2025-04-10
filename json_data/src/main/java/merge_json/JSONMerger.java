package merge_json;

import org.json.JSONObject;

public class JSONMerger {
	public static JSONObject merge(JSONObject obj1 ,JSONObject obj2) {
		JSONObject merge = new JSONObject(obj1.toMap());
		for(String key:obj2.keySet()) {
			merge.put(key, obj2.get(key));
		}
		return merge;
	}
}
