package com.tuyano.gradle;
import java.util.*;
class BookInformation{
    String title;
    String author;
    public BookInformation(String title,String author){
        this.author=author;
        this.title=title;
    }
}
public class BookArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookInformation[] B = new BookInformation[3];
        String[] title = {"a", "b", "c"};
        String[] author = new String[3];

        for (int i = 0; i < author.length; i++){
            System.out.println(i+1+". Enter author..! ");
            author[i] = scan.nextLine();
        }
        for(int j=0;j<B.length;j++) {
            B[j] = new BookInformation(title[j], author[j]);
            System.out.println(B[j].title + " : " + B[j].author);
        }
    }


}
