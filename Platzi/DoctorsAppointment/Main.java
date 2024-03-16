import java.util.Date;
import java.lang.Object;

// import static ui.UIMenu.*;

public class Main {
   public static void main(String[] args) {

      // showMenu();
      System.out.println("");

      Doctor myDoctor = new Doctor("Kosstas", "Kosstas.acunacer@gmail.com", "Engeneering");
      myDoctor.addAvailableAppointment(new Date(), "4pm");
      myDoctor.addAvailableAppointment(new Date(), "10pm");
      myDoctor.addAvailableAppointment(new Date(), "11pm");

      System.out.println(myDoctor);

      // for (Doctor.AvailableAppointment availableAppointments :
      // myDoctor.getAvailableAppointments()) {
      // System.out.println(availableAppointments.getDate() + " " +
      // availableAppointments.getTime());
      // }

      // System.out.println(myDoctor.getAvailableAppointments());

      System.out.println();
      System.out.println();

      Patient patient = new Patient("Kosstas", "Kosstas.acunacer@gmail.com");
      System.out.println(patient);

      System.out.println();
      System.out.println();

   }

}
