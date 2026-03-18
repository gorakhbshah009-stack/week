package workshop;

// Question 6: Lamp class with turnOn() and turnOff() methods

public class Q06_Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Lamp is ON: " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lamp is ON: " + isOn);
    }

    public static void main(String[] args) {
        Q06_Lamp lamp = new Q06_Lamp();
        lamp.turnOn();
        lamp.turnOff();
    }
}
