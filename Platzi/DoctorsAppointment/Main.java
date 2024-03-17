import java.util.Date;

import Model.Doctor;
import Model.Patient;
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

      User user = new Doctor("Jose", "Ksid.com", null);
      user.showDataUser();

      User userPatient = new Patient("Jose", "Ksid.com");
      userPatient.showDataUser();

      User userA = new Model.User.User("djfn", "kdfjkj") {
      
         @Override
         public void showDateUser(){

            System.out.println("Este es un DOCTOOOR");
         }
      };

userA.showDataUser();

// Ischedulable ischedulable = new Ischedulable(){
//    @Override
//    public void schedule(Date date, Strong time){


//    }
// };

   }
}
