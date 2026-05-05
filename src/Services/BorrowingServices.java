package Services;

import java.util.Scanner;

public class BorrowingServices {
    LibraryItemServices libraryItemServices = new LibraryItemServices();
    MemberServices memberServices = new MemberServices();
    Scanner scanner = new Scanner(System.in);

    /*public void BorrowItem(){
        System.out.println("Please enter your ID");
        String borrowerID = scanner.nextLine();
        memberServices.FindMemberByID();
    }*/
}
