public class Employee {
  public String name = "";
  public String employeeId = "";
  public double averageMonthlySalary = 0;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public Employee() {
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  public double calculatePay() {
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    return this.name + " " + this.employeeId + " " + String.format(format, averageMonthlySalary);
  }
}
