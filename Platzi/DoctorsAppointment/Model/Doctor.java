package Model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // Attribute:
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments;

    public Doctor(String name, String email, String speciality) {
        super(name, email);

        System.out.println("The assigned Doctor's name is: " + name);
        this.speciality = speciality;
        this.availableAppointments = new ArrayList<>();
    }

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable Dates: "
                + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        // Getters & Setters:

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Date: " + date + ", Time: " + time;
        }

    }

    // Override the showDataUser method inherited from the User class
    @Override
    public void showDataUser() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Speciality: " + speciality);
    }
}
