import java.util.Date;

import Model.Doctor;
import Model.User;

public class Main {
   public static void main(String[] args) {

      System.out.println("");

      // Doctor myDoctor = new Doctor("Kosstas", "Kosstas.acunacer@gmail.com",
      // "Engineering");
      // myDoctor.addAvailableAppointment(new Date(), "4pm");
      // myDoctor.addAvailableAppointment(new Date(), "10pm");
      // myDoctor.addAvailableAppointment(new Date(), "11pm");

      // System.out.println(myDoctor);

      System.out.println();
      System.out.println();

      // Patient patient = new Patient("Kosstas", "Kosstas.acunacer@gmail.com");
      // System.out.println(patient);

      System.out.println();
      System.out.println();

      // Assuming `user` and `doctor` are instances of User class,
      // as no such objects are instantiated in the provided code,
      // it's not clear what you intended to do here.
      // Assuming they are supposed to be instances of the User and Doctor classes
      // respectively,
      // you need to create instances of those classes before calling the
      // showDataUser() method.
      // For now, let's comment out these lines.

      User user = new Doctor("Jose", "Ksid.com", null);
      user.showDataUser();

   }
}
