package org.personal.crud1;

import java.util.LinkedList;
import java.util.List;

public class StudentCrud {
    
    private static final List<Students> students = new LinkedList<>();
    
    
    
    static{
        students.add (new Students(1 , "Sandeep Risal" , "Golfutar"));
        students.add (new Students(2 , "Liza Maharjan" , "Pulchowk"));
        students.add (new Students(3 , "Sameen Shrestha" , "Dhapasi"));
        
    }
    
    static Integer findId(int id){
        Integer index = null;
        for (Students student: students){
            if(student.getId()== id){
                index = students.indexOf(student);
                break;
               
            }
        }
        return index;
    }
    
    static void display(){
        for (Students student: students){
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("------------------------------------");
        }
    }
    
    static void save(Students Student){
        students.add(Student);
    }
    
    static void remove(int id){
        int index = findId(id);
        students.remove(index);
    }
    
    static void update(int id){
        int index = findId(id);
        Students student = students.get(index);
        student.setName("Areyousure");
        student.setAddress("No");
    }
    
    public static void main(String[] args) {
        
       display();
        System.out.println("--------------------------");
        
      save(new Students(4, "newdata" , "asdf"));
      display();
        System.out.println("----------------------------");
      
       remove(1);
       display();
        System.out.println("------------------------------");
      
        
       update(2);
       display();
       
       
      
        
        
    }
}
