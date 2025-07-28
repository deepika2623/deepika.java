public class Task1 {
    public static void main(String[] args) {
        String AccountholderName = "Deepika";
        int AccountBalance = 200000;
        int numberOfTransactions = 4;
        int depositAmount = 9000;
        int withdrawalAmount = 5000;
        boolean isAccountActive = true;

        double currentBalance = AccountBalance + depositAmount - withdrawalAmount;
        boolean depositAmountAndAccountActive = depositAmount > 0 && isAccountActive;
        boolean withdrawalAmountAndAccountActive = withdrawalAmount > 0 && isAccountActive;
        numberOfTransactions++;

        //Displaying the account details
        System.out.println("Account Holder Name: " + AccountholderName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
    }
}
