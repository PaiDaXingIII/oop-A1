public class OtherHealthProfessional extends HealthProfessional {

    //Added instance variables to distinguish other types of health professionals, such as their department
    private String department;

    //Default constructor 
    public OtherHealthProfessional() {
        super();
    }

    //The second constructor initializes all instance variables (including those in the base class)
    public OtherHealthProfessional(int ID, String name, String type, String department) {
        super(ID, name, type);
        this.department = department;
    }

    //A method for printing health professional details, including the type of health professional
    @Override
    public void printAllVariables() {
        super.printAllVariables();
        System.out.println("Department: " + department);
        System.out.println("Health Professional Type: Other Health Professional");
    }

    //Here are the getter and setter methods for the new instance variable

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}