/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book1_2;

/**
 *
 * @author Shimi
 */


import java.util.Scanner;

class Book {
    static String gen = "Adventure"; 
    String ti;
    String au;
    int year;

    static int count = 0;
    Book(String title, String author, int year) {
        this.ti = title;
        this.au = author;
        this.year = year;
    }

    
    void display_Book_Details() {
        System.out.println("Title = " + ti);
        System.out.println("Author = " + au);
        System.out.println("Year = " + year);
        System.out.println("Genre = " + gen);
        System.out.println();
    }    
    public static void display_Total_Books() {
        System.out.println("Total number of books = " + count);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        Book b1 = new Book(getInput("1st Book Title = "),
                getInput("1st Book Author = "), 
                Integer.parseInt(getInput("1st book releasing year =  ")));
        Book b2 = new Book(getInput("2nd Book Title = "), 
                getInput("2nd Book Author = "), 
                Integer.parseInt(getInput("2nd book releasing year =  ")));
        Book b3 = new Book(getInput("3rd Book Title = "),
                getInput("3rd Book Author = "), 
                Integer.parseInt(getInput("3rd book releasing year =  ")));     
        Book.count++;
        Book.count++;
        Book.count++;
        System.out.println("1st Book details:");
        b1.display_Book_Details();
        System.out.println("2nd Book details:");
        b2.display_Book_Details();
        System.out.println("3rd Book details:");
        b3.display_Book_Details();
        Book.display_Total_Books();
    }
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}