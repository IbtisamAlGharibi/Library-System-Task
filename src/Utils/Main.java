package Utils;

import Entities.LibraryItem;
import Entities.Member;
import Services.BorrowingServices;
import Services.LibraryItemServices;
import Services.MemberServices;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);
   static BorrowingServices borrowingServices = new BorrowingServices();
    static LibraryItemServices libraryItemServices = new LibraryItemServices();
    static MemberServices memberServices = new MemberServices();
    static  Member member = new Member();
    static List<LibraryItem> libraryItems = new ArrayList<>();
   static List<Member> members = new ArrayList<>();
    public static void main(String[] args){
        HandleMenu();

        }
         public static void HandleMenu(){
             System.out.println(MenuMessages.MAIN_MENU_MESSAGE);
                 Integer option = scanner.nextInt();

                 switch (option){
                     case 1 -> {
                             System.out.println("ADDING BOOK");
                             libraryItemServices.addNewItem();
                             HandleMenu();
                     }
                     case 2 ->{

                             System.out.println("ADDING MAGAZINE");
                             libraryItemServices.addNewItem();
                             HandleMenu();
                     }
                     case 3->{
                             for (int i =0;i< libraryItems.size();i++) {
                                 System.out.println(libraryItems.get(i));
                                 HandleMenu();
                             }
                         }
                     case 4->{

                             System.out.println("SEARCHING BY TITLE");
                             libraryItemServices.FindItemWhoContain();
                             HandleMenu();
                     }
                     case 5->{

                         System.out.println("REGISTERING NEW MEMBER");
                             memberServices.addNewMember();
                             HandleMenu();
                     }
                     case 6->{
                             for (int i =0;i< members.size();i++) {
                                 System.out.println(members.get(i));
                             }
                             HandleMenu();
                     }
                     case 7->{
                             System.out.println("BORROWING AN ITEM");
                             borrowingServices.BorrowItem();
                           HandleMenu();
                     }
                     case 8->{
                             System.out.println("RETURNING AN ITEM");
                             borrowingServices.ReturnItem();
                             HandleMenu();
                     }
                     case 9->{
                         System.out.println("Exit");
                         return;
                     }
                     default -> System.out.println("Select a choice from the list");
                 }
        }
}



