public class ContractedEmployee extends Employee {
  String federalTaxId = "";
  double hourlyRate = 0;
  double numberOfHoursWorked = 0;

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    this.employeeId = employeeId;
    this.name = name;
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  @Override
  public double calculatePay() {
    this.averageMonthlySalary = this.hourlyRate * this.numberOfHoursWorked;
    return this.averageMonthlySalary;
  }

}
