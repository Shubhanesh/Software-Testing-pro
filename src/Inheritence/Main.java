package src.Inheritence;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee("Shubhangi","Aher",1234,"Snr test Engineer");
        System.out.println("First Name:" + emp.getFirstName());
        System.out.println("Last name (with job title):" + emp.getLastName());
        System.out.println("Employee ID :" +emp.getEmployeeID());
    }
}
