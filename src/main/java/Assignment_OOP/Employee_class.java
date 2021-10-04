package Assignment_OOP;

public class Employee_class {
    /*. (Employee Class) Create a class called Employee that includes three instance variables—a first name (type String),
    a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables.
    Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value.
    Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
    Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.

     */
    String first_name;
    String last_name;
    double salary;

    public Employee_class(String first_name, String last_name, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0.0)
            this.salary = salary;
    }
}

class Employee_classTest{
    public static void main(String[] args) {
        Employee_class person1=new Employee_class("Fatmana","CIT",37);
        Employee_class person2=new Employee_class("Abraham","KK",42);

        System.out.println(person1.getSalary()*12);

        System.out.println(person2.getSalary()*12);

        System.out.println("After Raise");
//%10 raise ~~ 1.10

        person1.setSalary(person1.getSalary()*1.10);

        person2.setSalary(person2.getSalary()*1.10);

//yearly salary *12
        System.out.println(person1.getSalary()*12);

        System.out.println(person2.getSalary()*12);
    }
}
