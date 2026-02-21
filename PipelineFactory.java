import com.cicd.pipeline.pipeline.impl.MavenPipeline;
import com.cicd.pipeline.pipeline.impl.JUnitPipeline;
import com.cicd.pipeline.pipeline.impl.AWSPipeline;

public class PipelineFactory {
    public static Pipeline createPipeline(Config config) {
        if (config.getBuildTool().equals("maven")) {
            return new MavenPipeline();
        } else if (config.getTestFramework().equals("junit")) {
            return new JUnitPipeline();
        } else if (config.getDeploymentPlatform().equals("aws")) {
            return new AWSPipeline();
        }
        return null;
    }
}