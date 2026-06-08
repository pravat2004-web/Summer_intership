class Employee {
 String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    double calculateBonus() {
        return 0; 
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }
    double calculateBonus() {
        return salary * 0.20; 
    }
}
class Developer extends Employee {
    Developer(String name, int id, double salary) {
        super(name, id, salary);
    }
    double calculateBonus() {
        return salary * 0.10; 
    }
}
public class Employees {
    public static void main(String[] args) {
    
        Employee e = new Manager("Pravat", 101, 50000);
        e.displayDetails();
        System.out.println("Bonus: " + e.calculateBonus());
        System.out.println("-------------------");
        e = new Developer("Rahul", 102, 40000);
        e.displayDetails();
        System.out.println("Bonus: " + e.calculateBonus());
    }
}
