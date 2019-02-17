package pl.sda.behavioral.command;

public interface UndoableBankCommand extends BankCommand {
    void undo();
}