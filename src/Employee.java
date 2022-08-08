public class Employee {
    private String FIO;
    private String jobTitle;
    private String email;
    private String  telephone;
    private int age;

    public Employee(String FIO, String jobTitle, String email, String telephone, int age) {
        this.FIO = FIO;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }
}