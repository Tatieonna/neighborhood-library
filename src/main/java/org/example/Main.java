package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book[] bookArray= new Book[20];
        int bookCount = bookArray.length;
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while(option < 1 || option > 4){
            System.out.println("[1] Menu Options");
            System.out.println("[2] Show Available Books");
            System.out.println("[3] Show Checked Out Books");
            System.out.println("[4] Exit ");
            option = scanner.nextInt();
        }

        bookArray[0]= new Book(101,"978-1234567890", "The Secret of the Lost Ark", false, "" );
        bookArray[1]= new Book (102, "978-987654321","Mysteries of the Midnight Moon", false , "");
        bookArray[2]= new Book(103, "978- 5432109876", "Whispers in the Dark", false, "");
        bookArray[3]= new Book (104, "978-1112223334", "The Enchanted Forest", false, "");
        bookArray[4]= new Book(105, "978-5556667778", "A Tale of Two Cities", false, "");
        bookArray[5]= new Book (106, "978-8889990002", "The Lost Treasure Map", true, "Hailey");
        bookArray[6]= new Book(107,"978-4444333322", "Journey to the Center of the Earth", true, "Camden");
        bookArray[7]= new Book(108,"978-7777666554", "The Time Travelers Wife", true, "Matt" );
        bookArray[8]= new Book(109,"978-2222333446", "The Alchemist's Secret", false, "" );
        bookArray[9]= new Book(110,"978-6666555544", "The Da Vinci Code", true, "Christian");
        bookArray[10]= new Book(111,"978-1239876543", "Pride and Prejudice", true, "Jose" );
        bookArray[11]= new Book(112, "978-9999888877", "The Great Gatsby", true, "Eva");
        bookArray[12]= new Book(113, "978-5554443332", "The Hobbit", false,"");
        bookArray[13]= new Book(114,"978-2221110009", "The Catcher in the Rye", true, "Jasper" );
        bookArray[14]= new Book(115, "978-3332221118", "To Kill a Mockingbird", true,"Michel");
        bookArray[15]= new Book(116,"978-7775558886", "Brave New World", false, "");
        bookArray[16]= new Book(117,"978-6543211230", "War and Peace", false, "" );
        bookArray[17]= new Book(118,"978-8887779995", "1984", true, "Tatieonna");
        bookArray[18]= new Book(119, "978-9995554442", "The Hunger Games", true, "Boba");
        bookArray[19]= new Book(120,"978-1115553334", "Dune", false, "" );
    }

}