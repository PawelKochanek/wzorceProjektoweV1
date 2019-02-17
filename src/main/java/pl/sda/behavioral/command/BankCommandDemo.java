package pl.sda.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankCommandDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Initial balance: " + bankAccount.getBalance());

        List<BankCommand> commandsToExecute = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            Random random = new Random();
            BankCommand depositMoneyCommand = new DepositMoneyCommand(bankAccount, random.nextInt(100));
            commandsToExecute.add(depositMoneyCommand);
        }

        for (BankCommand bankCommand : commandsToExecute) {
            bankCommand.execute();
            System.out.println("Current balance: " + bankAccount.getBalance());
        }

        System.out.println("\nUndoing all the stuff!!!\n");

        for (BankCommand bankCommand : commandsToExecute) {
            if(bankCommand instanceof UndoableBankCommand) {
                ((UndoableBankCommand)bankCommand).undo();
                System.out.println("Current balance: " + bankAccount.getBalance());
            }
        }

        System.out.println("End balance: " + bankAccount.getBalance());




        System.out.println("After deposit balance: " + bankAccount.getBalance());
    }
}
