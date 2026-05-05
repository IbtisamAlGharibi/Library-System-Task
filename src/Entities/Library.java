package Entities;

public class Library extends Address {
    String libraryCode;
    String libraryName;

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }



    public String getLibraryName() {
        return libraryName;
    }

    public String getLibraryCode() {
        return libraryCode;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryCode='" + libraryCode + '\'' +
                ", libraryName='" + libraryName + '\'' +
                '}';
    }
}
