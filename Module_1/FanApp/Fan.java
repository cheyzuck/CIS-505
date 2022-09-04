package Module_1.FanApp;

public class Fan {
    public static void main(String[] args) {
        ConstructorFan myFan_01 = new ConstructorFan(2, true, 5, "blue"); /*
                                                                           * Yellow as a warning. Code will still work
                                                                           * as intended.
                                                                           */
        ConstructorFan myFan_02 = new ConstructorFan(); /* Yellow as a warning. Code will still work as intended. */
    }
}

/* These are Constructors. The first is a default Constructor. */
class ConstructorFan {
    int fanSpeed;
    boolean fanPower;
    double fanRadius;
    String fanColor;

    public ConstructorFan() {
        int fanSpeed = 0; /* Yellow as a warning. Code will still work as intended. */
        boolean fanPower = false; /* Yellow as a warning. Code will still work as intended. */
        double fanRadius = 6;
        String fanColor = "white";
        System.out.println("The fan is " + fanColor + " with a " + fanRadius + " inch radius, and it is off.");
    }

    public ConstructorFan(int fanSpeed, boolean fanPower, int fanRadius, String fanColor) {
        System.out.println("The fan is " + fanColor + " with a " + fanRadius + " inch radius, and it is set at speed "
                + fanSpeed + ".");
    }
}
