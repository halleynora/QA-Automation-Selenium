package qa.automation.util;

public class DataProvider {

    private String browser;

    private String runLocation;

    private String whereToRun;

    private String pathToChrome;


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getRunLocation() {
        return runLocation;
    }

    public void setRunLocation(String runLocation) {
        this.runLocation = runLocation;
    }

    public String getWhereToRun() {
        return whereToRun;
    }

    public void setWhereToRun(String whereToRun) {
        this.whereToRun = whereToRun;
    }

    public String getPathToChrome() {
        return pathToChrome;
    }

    public void setPathToChrome(String pathToChrome) {
        this.pathToChrome = pathToChrome;
    }
}
