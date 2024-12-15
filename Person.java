public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int ssn;

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setAge(int years) {
        age = years;
    }

    public void setSSN(int num) {
        ssn = num;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSSN() {
        return ssn;
    }

    public String toString() {
        return "SSN: " + ssn + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age;
    }
}
