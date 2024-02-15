package HomeWork;

public class Employee {
    private int personnelNumber;
    private int phone;
    private String name;
    private int experience;
    private static int ID = 0;


    public Employee(int phone, String name, int experience) {
        personnelNumber = ID++;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber=" + personnelNumber +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
