
package org.personal.crud;

import java.util.LinkedList;
import java.util.List;

public class BookCrud {
    private static final List<Books> books = new LinkedList<>();
    static {
        books.add(new Books(1 , "ABC" , "Sandeep Rrisal"));
        books.add (new Books(2 , "DEF" , "Lizu"));
        books.add (new Books(3, "GHI" , "jesus"));
    }
    
    static Integer findOne(int id){
        Integer index =null;
        for (Books book:books){
            if (book.getId()==id){
                index = books.indexOf(book);
                break;
                
            }
        }
        return index;
    }
    
    static void save(Books book){
        books.add(book);
    }
    
    static void display (){
        for (Books book:books){
            System.out.println("ID: " + book.getId());
            System.out.println("Name: " + book.getName());
            System.out.println("Writer: " + book.getWriter());
            System.out.println("-------------------------------");
        }
        
    }
    
    static void remove(int id){
        int index = findOne(id);
        books.remove(index);
    }
    
    static void update(int id){
        int index = findOne(id);
        Books book= books.get(index);
        book.setName("Areyousure");
        book.setWriter("AGAIN lizu");
    }
    
    public static void main(String[] args) {
        display();
        
        save(new Books(4, "ajsdkghf" , "lol"));
        display();
        
        remove(1);
        display();
        
        update(2);
        display();
    }
    
    
     
}
