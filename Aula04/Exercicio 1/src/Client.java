/**
 * @author Yago
 * @version 1.0
 * @since 04/03/21 - 07:33 PM
 * @category Model
 */
public class Client {

    private String name;
    private int age;
    private double salary;

    public Client() {
    }

    public Client(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return If the salary exceeds 15.000, returns that the person is rich. Otherwise, returns the person is "not rich".
     */
    public String rankSalary() {
        if (this.salary > 15000) {
            return ("Rich");
        } else {
            return ("Not rich :( (yet)");
        }
    }

    /**
     * @return If the age is over 18, returns that the person is of legal age. Otherwise, returns the person is under age.
     */
    public String rankAge() {
        if (this.age < 18) {
            return("Under age");
        } else {
            return("Legal age");
        }
    }

    /**
     * @return Returns name, age, salary, rank salary and rank age.
     */
    @Override
    public String toString() {
        return "\nName: " + this.name
             + "\nAge: " + this.age
             + "\nSalary: R$ " + this.salary
             + "\nRank Salary: " + rankSalary()
             + "\nRank Age: " + rankAge();
    }
}
