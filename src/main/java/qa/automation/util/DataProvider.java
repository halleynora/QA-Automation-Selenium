package qa.automation.util;

public class DataProvider {

    private String browser;

    private String runLocation;

    private String whereToRun;

    private String pathToChrome;

    private String akiliURL;

    private String teacherInvite;

    private String deleteTeacherEngpoint;

    private String akiliTestEmail;

    private String akiliTestPassword;

    public String getAkiliTestPassword() {
        return akiliTestPassword;
    }

    public void setAkiliTestPassword(String akiliTestPassword) {
        this.akiliTestPassword = akiliTestPassword;
    }

    public String getAkiliTestEmail() {
        return akiliTestEmail;
    }

    public void setAkiliTestEmail(String akiliTestEmail) {
        this.akiliTestEmail = akiliTestEmail;
    }

    public String getAkiliURL() {
        return akiliURL;
    }

    public void setAkiliURL(String akiliURL) {
        this.akiliURL = akiliURL;
    }

    public String getDeleteTeacherEngpoint() {
        return deleteTeacherEngpoint;
    }

    public void setDeleteTeacherEngpoint(String deleteTeacherEngpoint) {
        this.deleteTeacherEngpoint = deleteTeacherEngpoint;
    }

    public String getTeacherInvite() {
        return teacherInvite;
    }

    public void setTeacherInvite(String teacherInvite) {
        this.teacherInvite = teacherInvite;
    }

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
