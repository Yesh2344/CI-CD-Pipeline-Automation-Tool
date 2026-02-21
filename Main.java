import com.cicd.pipeline.config.Config;
import com.cicd.pipeline.config.ConfigLoader;
import com.cicd.pipeline.pipeline.Pipeline;
import com.cicd.pipeline.pipeline.PipelineFactory;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar build/libs/cicd-pipeline-automation-tool.jar config.json");
            return;
        }

        try {
            Config config = ConfigLoader.loadConfig(args[0]);
            Pipeline pipeline = PipelineFactory.createPipeline(config);
            pipeline.execute();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}