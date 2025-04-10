package merge_jsonobject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonMerger {
	public static ObjectNode mergeJson(JsonNode json1,JsonNode json2) {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode mergeJson = objectMapper.createObjectNode();
		mergeJson.setAll((ObjectNode)json1);
		mergeJson.setAll((ObjectNode)json2);
		return mergeJson;
	}
}
