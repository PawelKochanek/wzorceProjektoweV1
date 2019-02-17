package pl.sda.behavioral.strategy_and_mediator;

public class Gamepad implements IController {

    @Override
    public ControllerData readControllerData() {
        System.out.println("Move by Gamepad");
        return new ControllerData(100, 100);
    }
}
