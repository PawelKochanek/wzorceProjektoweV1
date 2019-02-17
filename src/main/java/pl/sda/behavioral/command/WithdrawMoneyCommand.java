package pl.sda.behavioral.command;

public class WithdrawMoneyCommand implements UndoableBankCommand {
    private final BankAccount bankAccount;
    private final int moneyToWithdraw;
    private boolean wasExecuted;

    public WithdrawMoneyCommand(BankAccount bankAccount, int moneyToWithdraw) {
        this.bankAccount = bankAccount;
        this.moneyToWithdraw = moneyToWithdraw;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(moneyToWithdraw);
        wasExecuted = true;
    }

    @Override
    public void undo() {
        if(wasExecuted) {
            bankAccount.deposit(moneyToWithdraw);
            wasExecuted = false;
        }
    }
}
