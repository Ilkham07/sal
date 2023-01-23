public class Person implements Payable, Comparable<Person>{
    private static int gen=1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        id = gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    @Override
    public String toString() {
        return "nothing";
    }

    @Override
    public int compareTo(Person o) {
        return (int) (this.getPaymentAmount() - o.getPaymentAmount());
    }

    public double getPaymentAmount(){
        return 0;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
