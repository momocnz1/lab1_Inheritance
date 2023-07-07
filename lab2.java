public class lab2 {
    public static void main(String[] args) {
        
    }
}
class employee{
    public String name;
    public int Emp_id;
    public int age;
    public int salary;

    public void working(){
        System.out.println(this.name + " is working");
    }

    /*public void DisplayDwtails(String name,int age,int Emp_id,int salary){
        this.name = name;
        this.age = age;
        this.Emp_id = Emp_id;
        this.salary = salary;
    }*/
    public void DisplayDwtails(){
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + this.age);
    System.out.println("Employee ID : " + this.Emp_id);
    System.out.println("Salary : " + this.salary);
    }
}

class manager extends employee{
    public void meeting(){
        System.out.println(this.name + "is working");
    }
}

class Programmer extends employee{

}
class Security extends employee{
    
}