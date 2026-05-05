package Entities;

public class LibraryItem {
    LibraryItem libraryItem = new LibraryItem();
    String title;
    String status;
    String  ID;
    Integer publishYear;

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String  getID() {
        return ID;

    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", ID=" + ID +
                ", publishYear=" + publishYear +
                '}';
    }

    public void DisplayItemsDetails(){
        System.out.println("Item Title: " + libraryItem.getTitle());
        System.out.println("Item ID: " + libraryItem.getID());
        System.out.println("Item publish year: " + libraryItem.getPublishYear());
        System.out.println("Item status: " + libraryItem.getStatus());
    }
}
