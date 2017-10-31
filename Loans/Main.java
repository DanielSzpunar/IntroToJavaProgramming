public class Main {

    public static void main(String[] args) {
	    Loan danielSzpunar = new Loan();
	    danielSzpunar.setLoanAmount(250000);
	    danielSzpunar.setNumberOfYears(20);
	    danielSzpunar.setAnnualInterestRate(2.5);
	    double monthly = danielSzpunar.getMonthlyPayment();
	    double total = danielSzpunar.getTotalPayment();
        System.out.println("Monthly payment: " + monthly);
        System.out.println("Total payment: " + total);
    }
}
