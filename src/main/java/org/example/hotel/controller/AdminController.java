package org.example.hotel.controller;
import org.example.hotel.util.Scan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    @Autowired
    private EmployeeController employeeController;
    @Autowired
    private RoomController roomController;
    @Autowired
    private GuestController guestController;
    @Autowired
    private BookingController bookingController;


    public  void start(){
         boolean b = true;
         while (b){
             menu();
             int n = action();
             switch (n){
                 case 1 -> employeeController.login();
                 case 2 -> complain();
                 default -> System.out.println("wrong option!");
             }

         }
    }
    public void menu(){
        System.out.println("1. Login\n" +
                           "2. Complain - (Arznomalar)");
    }

    public Integer action(){
        System.out.print("choose option: ");
        Integer number = Scan.scannerNum.nextInt();
        return number;
    }
    private void complain() {

    }



    public void adminMenu() {
        System.out.println("*********  Admin Menu  ********");
        System.out.println("1. Room");
        System.out.println("2. Convenient (qulayliklar)");
        System.out.println("3. Employee Type");
        System.out.println("4. Employee");
        System.out.println("5. Guest");
        System.out.println("6. Booking");
        System.out.println("7. OutCome (xarajatlar)");
        System.out.println("8. Cleaning");
        System.out.println("9. Complaint(shikoyatlar)");
        System.out.println("10.Go back");
        System.out.println("0.Exit");
    }
    public  void adminStart(){
        boolean b = true;
        while (b){
          adminMenu();
            int n = action();
            switch (n){
                case 1 -> roomSectionMenu();
                case 2 -> convenientSection();
                case 3 -> employeeTypeSection();
                case 4 -> employee();
                case 5 -> guest();
                case 6 -> booking();
                case 7 -> outCome();
                case 8 -> cleaning();
                case 9 -> complaint();
                case 10 -> menu();
                case 0-> b=false;
                default -> System.out.println("wrong option!");
            }

        }
    }



    public void roomSectionMenu() {
        System.out.println("*********  Room Menu  ********");
        System.out.println("1. Add Room");
        System.out.println("2. Room List");
        System.out.println("3. Delete Room");
        System.out.println("4. Update Room");
        System.out.println("5. Find Room");
        System.out.println("6. Room Convenient");
        System.out.println("7. Go back");
        System.out.println("0.Exit");
    }
    public  void roomStart(){
        boolean b = true;
        while (b){
            roomSectionMenu();
            int n = action();
            switch (n){
                case 1 -> roomController.addRoom();
                case 2 -> roomController.roomList();
                case 3 -> roomController.deleteRoom();
                case 4 -> roomController.updateRoom();
                case 5 -> roomController.findRoom();
                case 6 -> roomController.roomConvenient();
                case 7 -> adminMenu();
                case 0-> b=false;
                default -> System.out.println("wrong option!");
            }

        }
    }



    private void convenientSection() {

    }


    private void employeeTypeSection() {
    }


    private void employee() {
    }


    private void guest() {
    }


    private void booking() {
    }


    private void outCome() {
    }


    private void cleaning() {
    }


    private void complaint() {
    }
}
