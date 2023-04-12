// private class PrivateMod{  modifier private not allowed here
class PrivateMod{
    public static class BankAccount{
        private double balance;

        public BankAccount(double balance){
            this.balance = balance;
        }

        private void withdraw(double amount){
            balance -= amount;
        }

        public void deposit(double amount){
            balance += amount;
        }

        public double getBalance(){
            return balance;
        }
    }

    static class User extends BankAccount{
        String name;
        
        User(String name , double balance){
            super(balance);
            this.name = name;
        }

        public void details(){
            // System.out.println(name , balance);//error: balance has private access in BankAccount
            System.out.println(name);
        }
    }

    public static void main(String[] args){
        BankAccount sbi = new BankAccount(1000);
        // System.out.println(sbi.getBalance()); // 1000.0
        sbi.deposit(500);
        // System.out.println(sbi.getBalance()); //1500.0
        sbi.withdraw(1200);
        // System.out.println(sbi.getBalance()); //300.0

        User pnb = new User("ram",2000);
        pnb.details(); // ram
        System.out.println(pnb.getBalance()); // 2000.0  // can access its parent method
        // pnb.withdraw(200); cannot find symbol pnb.withdraw(200); bcz withdraw is a private method 
        pnb.deposit(200);
        System.out.println(pnb.getBalance()); // 2200.0
    }
}

// The private access modifier is specified using the keyword private. 
// The methods or data members declared as private are accessible only within the class in which they are declared.

// Any other class of the same package will not be able to access these members.
// Top-level classes or interfaces can not be declared as private because
// private means “only visible within the enclosing class”.
// protected means “only visible within the enclosing class and any subclasses”
// Hence these modifiers in terms of application to classes, apply only to nested classes and not on top-level classes