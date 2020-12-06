public class SalariedEmployee extends Employee {
  String socialSecurityNumber = "";
  double fixedMonthlyPayment = 0;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    this.employeeId = employeeId;
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  public double calculatePay() {
    this.averageMonthlySalary = fixedMonthlyPayment;
    return this.averageMonthlySalary;
  }

}
