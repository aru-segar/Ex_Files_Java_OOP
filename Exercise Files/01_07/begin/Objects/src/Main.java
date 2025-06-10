public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sally Roberts", "Los Angeles", 7000, 34);
        Employee employee2 = new Employee("John Smith", "New York", 8000, 45);
        Employee employee3 = new Employee("Alice Johnson", "Chicago", 9000, 29);

        employee2.raiseSalary(10);

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
    }
}
