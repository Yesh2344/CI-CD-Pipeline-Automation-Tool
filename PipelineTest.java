import com.cicd.pipeline.pipeline.Pipeline;
import com.cicd.pipeline.pipeline.PipelineFactory;
import com.cicd.pipeline.pipeline.impl.MavenPipeline;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PipelineTest {
    @Test
    public void testPipelineFactory() {
        Pipeline pipeline = PipelineFactory.createPipeline(new Config("maven", "junit", "aws"));
        assertNotNull(pipeline);
    }

    @Test
    public void testMavenPipeline() {
        Pipeline pipeline = new MavenPipeline();
        pipeline.execute();
    }

    @Test
    public void testJUnitPipeline() {
        Pipeline pipeline = new JUnitPipeline();
        pipeline.execute();
    }

    @Test
    public void testAWSPipeline() {
        Pipeline pipeline = new AWSPipeline();
        pipeline.execute();
    }
}