package pl.sda.behavioral.strategy_and_mediator;

public class ControllerDemo {
    public static void main(String[] args) {

        Robot robot = new Robot(new Keyboard());

        for (int i = 0; i < 10; i++) {
            robot.move();
            if(i == 4){
                robot.changeController(new Gamepad());
            }

        }
    }
}
