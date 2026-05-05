package Services;

import Entities.Book;
import Entities.LibraryItem;
import Entities.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryItemServices {
    static List<LibraryItem> libraryItems = new ArrayList<>();
LibraryItem libraryItem = new LibraryItem();
Book book = new Book();
Magazine magazine = new Magazine();
Scanner scanner = new Scanner(System.in);
    public LibraryItem addItem(){

        System.out.println(" ** Adding new Item **");
        System.out.println("Please enter Item Id");
        String newItemId = scanner.nextLine();
        libraryItem.setID(newItemId);

        System.out.println("Please enter the item title ");
        String itemTitle = scanner.nextLine();
        libraryItem.setTitle(itemTitle);

        System.out.println("Please enter the item publish year");
        Integer publishYear = Integer.valueOf(scanner.nextLine());
        libraryItem.setPublishYear(publishYear);

        System.out.println("Please enter Item status(Borrowed/Not Borrowed");
        String status = scanner.nextLine();
        libraryItem.setStatus(status);

        return null;
    }

    public List<LibraryItem> addNewItem(){
        Boolean continueFlag = true;
        while (continueFlag) {
            libraryItems.add(addItem());
            System.out.println("Enter q to exit, press ENTER to continue for more students");
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }
        return libraryItems;

    }
}

