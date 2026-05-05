package Utils;

import Entities.Member;
import Services.BorrowingServices;
import Services.LibraryItemServices;
import Services.MemberServices;

import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);
   static BorrowingServices borrowingServices = new BorrowingServices();
    static LibraryItemServices libraryItemServices = new LibraryItemServices();
    static MemberServices memberServices = new MemberServices();
    static  Member member = new Member();

    public static void main(String[] args){


        Boolean mainMenuContinue = true;
        while (mainMenuContinue) {
            Integer option = scanner.nextInt();
            switch (option){
                case 1 -> {
                    boolean first = true;
                    while (first){
                        System.out.println("ADDING BOOK");
                        libraryItemServices.addNewItem();
                        System.out.println("Enter E to exit");
                        if (scanner.nextLine().equalsIgnoreCase("e")) {
                            first = false;
                        }
                    }
                }
                case 2 ->{
                    boolean second = true;
                    while (second){
                        System.out.println("ADDING MAGAZINE");
                        libraryItemServices.addNewItem();
                        System.out.println("Enter E to exit");
                        if (scanner.nextLine().equalsIgnoreCase("e")) {
                            second = false;
                        }
                    }
                }

            }


        }

    }
}
