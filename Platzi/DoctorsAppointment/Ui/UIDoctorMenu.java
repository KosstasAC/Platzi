package Ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){

        int response = 0;

        do{
            System.out.println("\n\n");
            System.out.println("Signed up as a Doctor...");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Schedule");
            System.out.println("3. Log out");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1: 
                    showAddAvailableAppointment();
                    break;
                case 2:
                    break;
                case 3:
                    UIMenu.showMenu();
                    break;

                default:
                    System.out.println("Select an option... (1)(2)(3) ");

            }
            System.out.println("\n\n");



        }while(response != 0);
    }

    private static void showAddAvailableAppointment(){
        int response = 0;
        do{
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a Month ");

            for (int i = 0; i < 3; i++){
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }

            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response <4){
                int monthSelected = response;
                System.out.println("You have selected : " + monthSelected + ". Which is : "+ UIMenu.MONTHS[monthSelected]+ ". \nIs this correct? (Select (1) for Yes and (2) for No)");
                    Scanner scr = new Scanner(System.in);
                    int responseDate = Integer.valueOf(scr.nextLine());
                        
                    switch(responseDate){
                        case 1: 
                            System.out.println("Appointment Selection Completed.");
                            break;
                        case 2:
                            System.out.println("Please select the option 'Select a Month' and select the desire Month." );
                            showAddAvailableAppointment();
                            break;
                        default: 
                            System.out.println("INVALID RESPONSE SELECT. \nREDIRECTING...");
                            showAddAvailableAppointment();
                    }


            }else if(response == 0){
                showDoctorMenu();
            }
        }while(response == 1);

    }

}
