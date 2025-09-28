
public class MatiSense {
    protected String systemName;

    public MatiSense(String systemName) {
        this.systemName = systemName;
    }

    public void showInfo() {
        System.out.println("System: " + systemName);
    }
}
