package Utils;

import Entities.LibraryItem;
import Entities.Member;
import Services.BorrowingServices;
import Services.LibraryItemServices;
import Services.MemberServices;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);
   static BorrowingServices borrowingServices = new BorrowingServices();
    static LibraryItemServices libraryItemServices = new LibraryItemServices();
    static MemberServices memberServices = new MemberServices();
    static  Member member = new Member();
    static List<LibraryItem> libraryItems = new ArrayList<>();

    public static void main(String[] args){

        System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
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
                case 3->{
                    boolean third = true;
                    while (third){
                        for (int i =0;i< libraryItems.size();i++) {
                            System.out.println(libraryItems.get(i));
                        }
                        System.out.println("Enter E to exit");
                        if (scanner.nextLine().equalsIgnoreCase("e")) {
                            third = false;
                        }
                    }
                }
                case 4->{
                    boolean fourth = true;
                    while (fourth){
                        System.out.println("SEARCHING BY TITLE");
                        libraryItemServices.FindItemWhoContain();
                        System.out.println("Enter E to exit");
                        if (scanner.nextLine().equalsIgnoreCase("e")) {
                            fourth = false;
                        }
                    }

                }
            }


        }

    }
}
