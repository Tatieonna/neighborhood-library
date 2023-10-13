package org.example;

public class Book {
    public int id;
    public String isbn;
    public String title;
    public boolean isCheckedOut;
    public String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public void checkOut(String name){
        if (!isCheckedOut){
            isCheckedOut= true;
            checkedOutTo= name;
            System.out.println(name + "has checked out the book" + title);
        } else {
            System.out.println("Sorry, the book is already checked out " + checkedOutTo);
        }
    }
    public void checkIn(){
        if (isCheckedOut){
            System.out.println(checkedOutTo + "has checked in the book: " + title);
            isCheckedOut= false;
            checkedOutTo= null;
        } else {
            System.out.println("The book is already checked in.");
        }
    }
}
