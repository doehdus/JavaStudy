class AirConditioner {
    int roomTemp;
    int targetTemp;
    int mode;
    boolean power;
    int operationCount;

    // Default constructor
    AirConditioner() {
        this(26);
    }

    // Constructor with room temperature
    AirConditioner(int roomTemp) {
        this(roomTemp, 24);
    }

    // Constructor with room and target temperature
    AirConditioner(int roomTemp, int targetTemp) {
        this.roomTemp = roomTemp;

        if (targetTemp >= 18 && targetTemp <= 30) {
            this.targetTemp = targetTemp;
        } else {
            this.targetTemp = 24;
        }

        this.mode = 0;
        this.power = false;
        this.operationCount = 0;
    }

    // Turn on the air conditioner
    void turnOn() {
        power = true;
    }

    // Turn off the air conditioner
    void turnOff() {
        power = false;
    }

    // Set cooling or heating mode
    void setMode(int mode) {
        if (mode == 0 || mode == 1) {
            this.mode = mode;
        }
    }

    // Set target temperature
    void setTargetTemp(int temp) {
        if (temp >= 18 && temp <= 30) {
            this.targetTemp = temp;
        }
    }

    // Operate cooling or heating
    void operate() {
        if (!power) {
            return;
        }

        if (mode == 0) {
            if (roomTemp > targetTemp) {
                roomTemp--;
                operationCount++;
            }
        } else if (mode == 1) {
            if (roomTemp < targetTemp) {
                roomTemp++;
                operationCount++;
            }
        }
    }

    // Print current air conditioner status
    void printStatus() {
        System.out.println("Room Temperature: " + roomTemp);
        System.out.println("Target Temperature: " + targetTemp);

        if (mode == 0) {
            System.out.println("Mode: Cooling");
        } else {
            System.out.println("Mode: Heating");
        }

        if (power) {
            System.out.println("Power: ON");
        } else {
            System.out.println("Power: OFF");
        }

        System.out.println("Operation Count: " + operationCount);
        System.out.println();
    }
}

public class TestAirConditioner {
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner(28, 24);

        ac.turnOn();
        ac.setMode(0);

        ac.operate();
        ac.operate();
        ac.operate();

        ac.printStatus();

        ac.setMode(1);
        ac.setTargetTemp(29);

        ac.operate();
        ac.operate();

        ac.printStatus();

        ac.turnOff();
        ac.operate();

        ac.printStatus();
    }
}
