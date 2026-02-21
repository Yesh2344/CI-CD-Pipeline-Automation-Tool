import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static Config loadConfig(String configFile) throws JsonSyntaxException, JsonIOException, IOException {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(new FileReader(configFile), Config.class);
    }
}