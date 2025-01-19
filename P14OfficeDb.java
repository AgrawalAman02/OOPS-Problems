// Write a program to maintain the office database using inheritance. 
// The superclass is Employee that contains the information as follows:
// Emp_code, Emp_name, Address, Ph_no, Da-10%, Hra-20%.
//
// The inheritance properties held by the problem are as follows:
//
//                    Employee
//                    /      \
//           Teaching       Office
//           /      \        /      \
//     Faculty  Technical  Admin   Accounts
//
// Teaching class contains attributes: 
// - Subject Specialization
// - Designation
//
// Office class contains an attribute: 
// - Position
//
// Faculty class contains an additional attribute: 
// - Research Area
//
// Technical class contains an additional attribute: 
// - Tech Expert Area
//
// Each lowest-level class (Faculty, Technical, Administrative, Accounts) has:
// - Basic Pay
//
// Implement the inheritance concept from the above figure and 
// calculate the salary statement for each employee.


class Employee{
    String emp_Code;
    String emp_Name;
    String address;
    String ph_no;
    int basicPay;
    private final double daRate = 10.0;  // DA = 10%
    private final double hraRate = 20.0; // HRA = 20%

    public Employee(String emp_Code , String emp_Name,String address, String ph_no,int basicPay){
        this.emp_Code = emp_Code;
        this.emp_Name = emp_Name;
        this.address = address;
        this.ph_no = ph_no;
        this.basicPay = basicPay;
    }

    public double calculateDA() {
        return (daRate / 100) * basicPay;
    }

    public double calculateHRA() {
        return (hraRate / 100) * basicPay;
    }

    // Calculate Total Salary
    public double calculateSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    public void displayData(){
        System.out.println("Employee Code: " + emp_Code);
        System.out.println("Employee Name: " + emp_Name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + ph_no);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (10%): " + calculateDA());
        System.out.println("HRA (20%): " + calculateHRA());
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Teaching extends Employee{

    public Teaching(String emp_Code,String emp_Name, String address , String  ph_no , String subjectSpecialisation, String Designation, int basicPay){
        super(emp_Code, emp_Name, address, ph_no,basicPay);
        this.Designation = Designation;
        this.subjectSpecialisation = subjectSpecialisation;
    }

    String subjectSpecialisation;
    String Designation;
}

class Office extends Employee{

    public Office(String emp_Code,String emp_Name, String address , String  ph_no , String position, int basicPay){
        super(emp_Code, emp_Name, address, ph_no,basicPay);
        this.position = position;
    }

    String position;
}

class Faculty extends Teaching{

    public Faculty(String emp_Code,String emp_Name, String address , String  ph_no , String subjectSpecialisation, String Designation , String researchArea, int basicPay){
        super(emp_Code, emp_Name, address, ph_no, subjectSpecialisation, Designation,basicPay);
        this.researchArea = researchArea;
    }

    String researchArea;

    @Override
    public void displayData(){
        super.displayData();
        System.out.println("Research Area : "+ researchArea);
        System.out.println("-----------------------------------");
    }

}
class Technical extends Teaching{

    public Technical(String emp_Code,String emp_Name, String address , String  ph_no , String subjectSpecialisation, String Designation , int basicPay, String techExpertArea){
        super(emp_Code, emp_Name, address, ph_no, subjectSpecialisation, Designation,basicPay);
        this.basicPay = basicPay;
        this.techExpertArea = techExpertArea;
    }

    String techExpertArea;

    @Override
    public void displayData(){
        super.displayData();
        System.out.println("Tech Expert Area : "+ techExpertArea);
        System.out.println("-----------------------------------");
    }

}

class Admin extends Office{

    public Admin(String emp_Code,String emp_Name, String address , String  ph_no , String position, int basicPay){
        super(emp_Code, emp_Name, address, ph_no, position,basicPay);
    }

    @Override
    public void displayData(){
        super.displayData();
        System.out.println("-----------------------------------");
    }

}
class Accounts extends Office{

    public Accounts(String emp_Code,String emp_Name, String address , String  ph_no , String position, int basicPay){
        super(emp_Code, emp_Name, address, ph_no, position,basicPay);

    }

    @Override
    public void displayData(){
        super.displayData();
        System.out.println("-----------------------------------");
    }

}


 public class P14OfficeDb {
 
    public static void main(String[] args) {
        
        Faculty faculty = new Faculty("F001", "Dr. Sharma", "Delhi", "9876543210", 
                                      "Computer Science", "Professor", "AI & ML", 50000);

        Technical technical = new Technical("T001", "Mr. Agrawal", "Bangalore", "9988776655", "Software Engineering", "Engineer",  40000,"Java");

        Admin admin = new Admin("A001", "Mrs. Roy", "Mumbai", "8899776655", "HR Manager", 45000);

        Accounts accounts = new Accounts("AC001", "Mr. Mehta", "Pune", "7766554433", "Finance Head", 55000);


        // Displaying employee details
        faculty.displayData();
        technical.displayData();
        admin.displayData();
        accounts.displayData();
    }
 }