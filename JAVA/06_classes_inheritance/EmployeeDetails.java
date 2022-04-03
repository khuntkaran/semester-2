class Member{
    String name, phoneNumber, address;
    int age;
    double salary;
    Member(String name, int age, String phoneNumber, String address, double salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
    void printSalary(){
        System.out.println("Salary : " + salary);
    }
    void printDetails(){
        System.out.print("Name : " + name + "\n");
        System.out.print("Age : " + age + "\n");
        System.out.print("Address : " + address + "\n");
        System.out.print("Mobile No : " + phoneNumber + "\n");
    }
}
class Employee extends Member{
    String specialization;
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization){
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
        }
    void printspecialization(){
        System.out.println("specialization : "+specialization);
        System.out.println();
    }
}
class Manager extends Member{
    String department;
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department){
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    void printdepartment(){
        System.out.println("department : "+department);
        System.out.println();
    }
}
public class EmployeeDetails{
    public static void main(String[] args){

        Employee e = new Employee("uttam",18,"0987654321","Rajkot",150000.00,"java");
        Manager m = new Manager("karan",17,"1234567890","Mahika",135431.56,"python");
        e.printDetails();
        e.printSalary();
        e.printspecialization();
        m.printDetails();
        m.printSalary();
        m.printdepartment();
    }
}