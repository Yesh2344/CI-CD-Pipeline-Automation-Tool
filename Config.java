# Minor edit
public class Config {
    private String buildTool;
    private String testFramework;
    private String deploymentPlatform;

    public Config(String buildTool, String testFramework, String deploymentPlatform) {
        this.buildTool = buildTool;
        this.testFramework = testFramework;
        this.deploymentPlatform = deploymentPlatform;
    }

    public String getBuildTool() {
        return buildTool;
    }

    public String getTestFramework() {
        return testFramework;
    }

    public String getDeploymentPlatform() {
        return deploymentPlatform;
    }
}