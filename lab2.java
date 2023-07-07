public class lab2 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 30, 123, 50000, "IT"); 
        Programmer programmer = new Programmer("Jane Smith", 30, 456, 40000, "Java");
        Security security = new Security("Jones", 45, 789, 18000, "Night");
        manager.DisplayDwtails();
        manager.work();
        manager.meeting();
        programmer.DisplayDwtails();
        programmer.work();
        programmer.Coding();
        security.DisplayDwtails();
        security.work();
        security.Patrol();
    }
}
class employee{
    public String name;
    public int Emp_id;
    public int age;
    public int salary;
    employee(String name,int age,int Emp_id,int salary){
        this.name = name;
        this.age = age;
        this.Emp_id = Emp_id;
        this.salary = salary;
    }
    public void work(){
        System.out.println(this.name + " is working");
    }
    public void DisplayDwtails(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Employee ID : " + this.Emp_id);
        System.out.println("Salary : " + this.salary);
    }
}
class Manager extends employee{
    public String depertmenr;
    Manager(String name,int age,int Emp_id,int salary,String depertmenr){
        super(name,age,Emp_id,salary);
        this.depertmenr = depertmenr;
    }
    public void meeting(){
        System.out.println(this.name + " is scheduling a meeting");
    }
}
class Programmer extends employee{
    public String language;
    Programmer(String name,int age,int Emp_id,int salary,String language){
        super(name,age,Emp_id,salary);
        this.language = language;
    }
    public void Coding(){
        System.out.println(this.name + " is coding");
    }
}
class Security extends employee{
    public String shift;
    Security(String name,int age,int Emp_id,int salary,String shift){
        super(name, age, Emp_id, salary);
        this.shift = shift;
    }
    public void Patrol(){
        System.out.println(this.name + " is Patrolling");
    }
}