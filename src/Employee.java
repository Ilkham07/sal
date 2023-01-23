public class Employee extends       Person{
    private String position;
    private double salary;

    @Override
    public String toString() {
        return getPosition() + ": " + getId() + "." + getName() + " " + getSurname();
    }

    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    public String getPosition() {
        return position;
    }


    public double getPaymentAmount(){
        return getSalary();
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
