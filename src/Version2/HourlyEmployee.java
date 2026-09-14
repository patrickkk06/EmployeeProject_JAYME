package Version2;

import java.time.LocalDate;

public class HourlyEmployee {

    private int empID;
    private Name empName;
    private float totalHoursWorked;
    private double ratePerHour;
    private MyDate dateHired;
    private MyDate birthDate;

    // Default constructor
    public HourlyEmployee() {
        this.empID = 0;
        this.empName = new Name("N/A");
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
        this.dateHired = new MyDate();
        this.birthDate = new MyDate();
    }

    // Partial constructor
    public HourlyEmployee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
        this.dateHired = new MyDate();
        this.birthDate = new MyDate();
    }

    // Full constructor
    public HourlyEmployee(int empID, Name empName,
                          float totalHoursWorked, double ratePerHour,
                          MyDate dateHired, MyDate birthDate) {

        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
    }

    // Getters and Setters

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked >= 0) {
            this.totalHoursWorked = totalHoursWorked;
        }
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour >= 0) {
            this.ratePerHour = ratePerHour;
        }
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    // Compute salary
    public double computeSalary() {

        double salary;

        if (totalHoursWorked <= 40) {
            salary = totalHoursWorked * ratePerHour;
        } else {
            double regularPay = 40 * ratePerHour;
            double overtimePay =
                    (totalHoursWorked - 40) * (ratePerHour * 1.5);

            salary = regularPay + overtimePay;
        }

        // Birthday bonus
        int currentMonth = LocalDate.now().getMonthValue();

        if (birthDate != null &&
                birthDate.getMonth() == currentMonth) {

            salary += 5000;
        }

        return salary;
    }

    // Display employee information
    public void displayHourlyEmployee() {

        System.out.printf(
                "ID: %d | Name: %s | Hours: %.2f | Rate: PHP %.2f/hr%n",
                empID,
                empName,
                totalHoursWorked,
                ratePerHour
        );

        System.out.printf(
                "Date Hired: %s | Birth Date: %s%n",
                dateHired,
                birthDate
        );
    }

    // toString
    @Override
    public String toString() {

        return String.format(
                "HourlyEmployee [ID: %d, Name: %s, Hours: %.2f, " +
                        "Rate: PHP %.2f, Date Hired: %s, Birth Date: %s, " +
                        "Total Salary: PHP %,.2f]",
                empID,
                empName,
                totalHoursWorked,
                ratePerHour,
                dateHired,
                birthDate,
                computeSalary()
        );
    }
}