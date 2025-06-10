public class Employee {
    String name;
    String location;
    double salary;
    int age;

    public Employee(String name, String location, double salary, int age) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }

    void raiseSalary(double percent) {
        this.salary = this.salary + (this.salary * percent / 100);
    }
}
