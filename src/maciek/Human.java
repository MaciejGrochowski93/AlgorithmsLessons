package maciek;

public class Human {
    private String gender;
    private String firstName;
    private double salary;

    public Human(String gender, String firstName, double salary) {
        this.gender = gender;
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
