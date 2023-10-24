package minggu9.StudiKasus1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phoneNumber, String socialSecurityNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phoneNumber, socialSecurityNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPay = super.pay();
        double commissionPay = totalSales * commissionRate;
        totalSales = 0; // Reset total sales to 0 after calculating commission
        return hourlyPay + commissionPay;
    }

    @Override
    public String toString() {
        String hourlyInfo = super.toString();
        return hourlyInfo + "\nTotal Sales: $" + totalSales;
    }
}
