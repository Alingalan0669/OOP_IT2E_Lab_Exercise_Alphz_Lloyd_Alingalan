public class LGU extends MatiSense {
    private String department;

    public LGU(String systemName, String department) {
        super(systemName);
        this.department = department;
    }

    @Override
    public void showInfo() {
        System.out.println("LGU Department: " + department + " | Connected to " + systemName);
    }

    public void announce(String message) {
        System.out.println(department + " Announcement: " + message);
    }

    public void announce(String message, String urgency) {
        System.out.println(department + " [" + urgency + "] Announcement: " + message);
    }
}
