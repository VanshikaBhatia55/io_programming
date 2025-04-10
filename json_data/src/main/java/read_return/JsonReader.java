package read_return;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonReader {

    public static User readAndExtractField(String filePath) {
    	 Gson gson = new Gson();
         User user = null;

         try (FileReader reader = new FileReader(filePath)) {
             // Parse the JSON file into a User object
             user = gson.fromJson(reader, User.class);
         } catch (IOException e) {
             e.printStackTrace();
         }

         return user; // Return the User object so it can be tested
     }
    
}
