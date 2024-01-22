package src.Inheritence;

public class Employee extends Person{
   private String jobTitle;
   private int EmployeeID;

   public Employee(String firstName,String lastName,int EmployeeId,String jobTitle){
       super(firstName,lastName);
       this.EmployeeID= EmployeeId;
       this.jobTitle=jobTitle;
   }

    public int getEmployeeID() {
        return EmployeeID;
    }

    @Override
    public String getLastName() {
        return super.getLastName()+ ","+ jobTitle;
    }
}
