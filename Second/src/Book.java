import java.util.Scanner;

public class Book {
    String author, name;
    int year, amount_of_pages;

    Book(){
        author = "Pushkin";
        name = "Kirill";
        year = 1978;
        amount_of_pages = 500;
    }
    Book(String author_, String name_, int year_, int amount_of_pages_){
        author = author_;
        name = name_;
        year = year_;
        amount_of_pages = amount_of_pages_;
    }
    public void change_fields(){
        Scanner sc = new Scanner(System.in);
        author = sc.next();
        name = sc.next();
        year = sc.nextInt();
        amount_of_pages = sc.nextInt();
    }
    public void view(String name){
        if(this.name == name){
            System.out.println("Author: " + author);
            System.out.println("Year: " + year);
            System.out.println("Pages: " + amount_of_pages);
        }
        else{
            System.out.println("NO information!");
        }
    }
}