package Model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String blood;

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }

    /**
     * The getters and setters of the variables that the class
     * "Patient" and "Doctor" have in common.
     * They're all finded in the User file which serves as an extention
     * to the other two classes. Using the process of
     * Heritence, the classes can pass their variables.
     * 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return name;

    }

    public void setName() {

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress() {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        if (phoneNumber.length() > 8) {
            System.out.println("El numero telefonico debe ser de 8 digitos maximo.");

        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "User : " + name + ", Email : " + email + "\nAddress : " + address +
                ". Phone : " + phoneNumber;
    }

    public abstract void showDataUser();

	public class User {
	}

}
