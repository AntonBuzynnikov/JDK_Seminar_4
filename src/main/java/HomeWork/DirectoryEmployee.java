package HomeWork;

import java.util.ArrayList;
import java.util.List;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
 */
public class DirectoryEmployee {
    private final List<Employee> employees;

    public DirectoryEmployee() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public Employee findForPersonnelNumber(int personnelNumber){
        for (Employee employee:employees){
            if(employee.getPersonnelNumber() == personnelNumber) return employee;
        }
        return null;
    }
    public List<Employee> findForExperience(int experience){
        List<Employee> employeesExperience = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getExperience() == experience) employeesExperience.add(employee);
        }
        return employeesExperience;
    }
    public List<Integer> findForName(String name){
        List<Integer> employeesPhone = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getName().equals(name)) employeesPhone.add(employee.getPhone());
        }
        return employeesPhone;
    }

}
