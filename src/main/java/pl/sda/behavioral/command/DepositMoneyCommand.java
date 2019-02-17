package pl.sda.behavioral.command;

public class DepositMoneyCommand implements UndoableBankCommand {
    private final BankAccount bankAccount;
    private final int moneyToDeposit;
    private boolean wasExecuted;

    public DepositMoneyCommand(BankAccount bankAccount, int moneyToDeposit) {
        this.bankAccount = bankAccount;
        this.moneyToDeposit = moneyToDeposit;
    }

    @Override
    public void execute() {
        bankAccount.deposit(moneyToDeposit);
        wasExecuted = true;
    }

    @Override
    public void undo() {
        if(wasExecuted) {
            bankAccount.withdraw(moneyToDeposit);
            wasExecuted = false;
        }
    }
}