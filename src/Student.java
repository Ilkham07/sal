public class Student extends Person{
    private double gpa;

    @Override
    public String toString() {
        return "Student: " + getId() + "." + getName() + " " + getSurname();
    }

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount(){
        if(getGpa()>2.67) {return 36660;}
        else{return 0;}
    }
}
