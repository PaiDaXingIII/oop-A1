public class OtherHealthProfessional extends HealthProfessional {

    // 新增实例变量，用于区分其他类型健康专业人员，比如所属科室
    private String department;

    // 默认构造函数
    public OtherHealthProfessional() {
        super();
    }

    // 第二个构造函数初始化所有实例变量（包括基类中的变量）
    public OtherHealthProfessional(int ID, String name, String type, String department) {
        super(ID, name, type);
        this.department = department;
    }

    // 打印卫生专业人员详细信息（包括卫生专业人员类型）的方法
    @Override
    public void printAllVariables() {
        super.printAllVariables();
        System.out.println("Department: " + department);
        System.out.println("Health Professional Type: Other Health Professional");
    }

    // 以下是新增实例变量的getter和setter方法

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}