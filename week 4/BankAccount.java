public class BankAccount {
    public static void main(String[] args) {

        Account a1 = new Account("A101", "Ansh");
        Account a2 = new Account("A102", "Rahul", 1000);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.deposit(500));
        System.out.println(a1.deposit(0));
        System.out.println(a1.deposit(-100));

        System.out.println(a2.withdraw(300));
        System.out.println(a2.withdraw(1000));

        System.out.println(a1);
        System.out.println(a2);
    }
}
