package OOP.methods;

public class Banking {
    public static void main(String[] args) {
        SavingAccount one = new SavingAccount();
        Account first = new Account();
        CurrentAccount two = new CurrentAccount();
        System.out.println("your interest is " + first.calculateInterest());
        System.out.println("your Saving balance is " + one.calculateInterest());
        System.out.println("your balance is " + two.calculateInterest());
        
        
    }
}

class Account{
    double balance = 1000;
    double calculateInterest(){
        return balance*0.02;
    }
}
class SavingAccount extends Account{
    @Override
    double calculateInterest(){
        return balance+40;
    }
}
class CurrentAccount extends Account{
    @Override
    double calculateInterest(){
        return balance;
    }
}