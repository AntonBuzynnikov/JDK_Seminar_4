package HomeWork;

public class Main {
    public static void main(String[] args) {
        DirectoryEmployee directoryEmployee = new DirectoryEmployee();
        directoryEmployee.addEmployee(new Employee(123456,"Oleg",10));
        directoryEmployee.addEmployee(new Employee(123457,"Fedor",11));
        directoryEmployee.addEmployee(new Employee(123458,"Grigory",12));
        directoryEmployee.addEmployee(new Employee(123459,"Alex",13));
        directoryEmployee.addEmployee(new Employee(123451,"Ivan",14));
        directoryEmployee.addEmployee(new Employee(123452,"Ivan",15));
        directoryEmployee.addEmployee(new Employee(123453,"Alex",15));
        System.out.println(directoryEmployee.findForExperience(15));
        System.out.println(directoryEmployee.findForPersonnelNumber(3));
        System.out.println(directoryEmployee.findForName("Ivan"));
    }
}
