package pl.sda.behavioral.strategy_and_mediator;

public class Keyboard implements IController {

    @Override
    public ControllerData readControllerData() {
        System.out.println("Move by keyboard");
        return new ControllerData(100, 0);
    }
}
