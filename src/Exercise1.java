//model a person with a first name and a last name and ensure that even if the first name is entered
//in all lowercase, it will be stored in all uppercase.

public class Exercise1 {

    String firstName;
    String lastName;

    public void Person(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }
}
