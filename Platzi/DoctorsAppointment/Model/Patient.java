package Model;

public class Patient extends User {

    private String birthday;
    private String blood;
    private double weight;
    private double height;

    Patient(String name, String email) {
        super(name, email);

    }

    // Getters & Setters:
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";

    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    // Override:
    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: "
                + getHeight() + "\nBlood: " + blood;

    }
}
