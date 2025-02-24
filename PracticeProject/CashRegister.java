package PracticeProject;

public class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount; // number of items purchased

    // constructor for purchase, payment and itemCount
    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    // method to keep purchase amount and increment item count
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++; // increment item count with each purchase
    }

    // method to get payment and add to the payment total
    public void receivePayment(double amount) {
        payment += amount;
    }

    // method to give change and reset the purchase/payment
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    // instance method to get the item count
    public int getItemCount() {
        return itemCount;
    }

    public static int countTotal(CashRegister[] registers) {
        int totalItems = 0;
        for (CashRegister register : registers) {
            totalItems += register.getItemCount();
        }
        return totalItems;
    }

    @Override
    public String toString() {
        return "CashRegister [purchase=" + purchase + ", payment=" + payment + ", items=" + itemCount + "]";
    }

    public static void main(String[] args) {
        CashRegister register1 = new CashRegister();
        CashRegister register2 = new CashRegister();

        register1.recordPurchase(10.5);
        register1.recordPurchase(20.3);

        register2.recordPurchase(15.0);

        register1.receivePayment(50);
        register2.receivePayment(30);

        System.out.println("Change for register1: " + register1.giveChange());
        System.out.println("Change for register2: " + register2.giveChange());

        System.out.println("Items in register1: " + register1.getItemCount());
        System.out.println("Items in register2: " + register2.getItemCount());

        CashRegister[] registers = { register1, register2 };

        int totalItems = CashRegister.countTotal(registers);
        System.out.println("Total items purchased across all registers: " + totalItems);
    }
}