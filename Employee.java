public class Employee 
{
    // Static variable to track number of employees created
    private static int count = 0;

    private String name;

    // Constructor to initialize employee name and increment count
    public Employee(String name)
    {
        this.name = name;
        count++;
    }

    // Static method to retrieve total number of employees
    public static int getEmployeeCount() 
    {
        return count;
    }

    public static void main(String[] args)
    {
        // Create employee objects
        Employee emp1 = new Employee("sowmya");
        Employee emp2 = new Employee("kundeti");
        Employee emp3 = new Employee("bhuvana");

        // Print total number of employees created
        System.out.println("Total number of employees: " + Employee.getEmployeeCount());
    }
}
