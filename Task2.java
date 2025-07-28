public class Task2 {
    public static void main(String[] args){
        int carCost = 2840887;
        int downPayment = 840000;
        double bankInterestRate = 9.50;
        int loanPeriod = 4;

        int totalLoanAmount = carCost - downPayment;
        double monthlyInterestRate = bankInterestRate / 12 /100;
        int numberofMonths = loanPeriod * 12;

        double monthlyEMI  = (totalLoanAmount * monthlyInterestRate* Math.pow((1+ monthlyInterestRate), numberofMonths))/ ( Math.pow((1+ monthlyInterestRate), numberofMonths) - 1);

        long roundedEMI = Math.round(monthlyEMI);

        System.out.println("Total Loan Amount: " + totalLoanAmount);
        System.out.println("Monthly Interest: " + monthlyInterestRate);
        System.out.println("Number of Months: " + numberofMonths);
        
        System.out.println("Monthly EMI: " + roundedEMI);
    }
}


