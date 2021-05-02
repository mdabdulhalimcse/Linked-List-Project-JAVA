package linkedlistjava;

import java.util.LinkedList;

public class display{
 
    public void show(){
        
        LinkedList<student> list = new LinkedList<student>();
             
           for(student s: list){
            System.out.println("Name : "+s.name);
            System.out.println( "Student ID : "+ s.id );
            System.out.println( "CGPA  : "+ s.cgpa);
        }
}
    
}
