public class DroneControlSystem {

    private int positionX = 0;
    private int positionY = 0;
    private int speed = 0;
    private int batteryLevel = 100;

    private static final int MOVE_STEP = 10;
    private static final int HIGH_SPEED_THRESHOLD = 80;

    public void move(int direction, int speedInput) {
        handleMovement(direction);
        handleSpeed(speedInput);
        handleBattery();

        printStatus();
    }

    private void handleMovement(int direction) {
        switch (direction) {
            case 1 -> moveLeft();
            case 2 -> moveRight();
            case 3 -> moveUp();
            case 4 -> moveDown();
        }
    }

    private void moveLeft() { positionX -= MOVE_STEP; }
    private void moveRight() { positionX += MOVE_STEP; }
    private void moveUp() { positionY += MOVE_STEP; }
    private void moveDown() { positionY -= MOVE_STEP; }

    private void handleSpeed(int speedInput) {
        speed = (speedInput > HIGH_SPEED_THRESHOLD) ? 100 : 50;
    }

    private void handleBattery() {
        if (batteryLevel < 20) {
            System.out.println("LOW BATTERY");
        }
        batteryLevel -= 5;
    }

    private void printStatus() {
        System.out.println(positionX);
        System.out.println(positionY);
        System.out.println(speed);
        System.out.println(batteryLevel);
    }
}
