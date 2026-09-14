/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java
 * to edit this template
 */
package Version1;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("--- Hourly Employee Test ---");

        HourlyEmployee hourly1 =
                new HourlyEmployee(101, "Sean Galo");

        hourly1.setTotalHoursWorked(43);
        hourly1.setRatePerHour(250);

        HourlyEmployee hourly2 =
                new HourlyEmployee(102, "Raphael Chebar", 40, 250);

        System.out.println("[displayHourlyEmployee()]");

        hourly1.displayHourlyEmployee();
        hourly2.displayHourlyEmployee();

        System.out.println();

        System.out.println("[toString()]");

        System.out.println(hourly1);
        System.out.println(hourly2);



        System.out.println("\n--- Piece Worker Employee Test ---");

        PieceWorkerEmployee piece1 =
                new PieceWorkerEmployee(201, "Rod Zagado");

        piece1.setTotalPiecesFinished(280);
        piece1.setRatePerPiece(20);

        PieceWorkerEmployee piece2 =
                new PieceWorkerEmployee(202, "Dwyne Armecin", 320, 20);

        System.out.println("[displayPieceWorkerEmployee()]");

        piece1.displayPieceWorkerEmployee();
        piece2.displayPieceWorkerEmployee();

        System.out.println();

        System.out.println("[toString()]");

        System.out.println(piece1);
        System.out.println(piece2);

        System.out.println("\n--- Commission Employee Test ---");

        CommissionEmployee commission1 =
                new CommissionEmployee(301, "Em Luoyluoy");

        commission1.setTotalSale(83000);

        CommissionEmployee commission2 =
                new CommissionEmployee(302, "Nino Dionson", 138000);

        System.out.println("[displayCommissionEmployee()]");

        commission1.displayCommissionEmployee();
        commission2.displayCommissionEmployee();

        System.out.println();

        System.out.println("[toString()]");

        System.out.println(commission1);
        System.out.println(commission2);



        System.out.println("\n--- Base Plus Commission Employee Test ---");

        BasePlusCommissionEmployee base1 =
                new BasePlusCommissionEmployee(401, "Oliver Jones");

        base1.setTotalSale(325000);
        base1.setBaseSalary(40000);

        BasePlusCommissionEmployee base2 =
                new BasePlusCommissionEmployee(
                        402,
                        "Clifford Balili",
                        480000,
                        52000
                );

        System.out.println("[displayBasePlusCommissionEmployee()]");

        base1.displayBasePlusCommissionEmployee();
        base2.displayBasePlusCommissionEmployee();

        System.out.println();

        System.out.println("[toString()]");

        System.out.println(base1);
        System.out.println(base2);
    }
}