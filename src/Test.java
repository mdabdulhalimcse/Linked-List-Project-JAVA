
import java.awt.SystemColor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import linkedlistjava.student;

public class Test {
    LinkedList <Info> list;
    
    public Test()
    {
        list = new LinkedList<>();
    }
    
    public boolean check()
    {
        if(list.isEmpty()) return true;
        else return false;
    }
    
    public void insert(Info info)
    {
        list.add(info);
    }
    
    public void display()
    {
        System.out.println("\n\nStudent Information:  \n");
        for(Info element : list)
        {
          
                System.out.println("Name: "+element.name);
                System.out.println("ID: "+element.ID);
                System.out.println("Age: "+element.age);
                System.out.println();
             
              //  System.out.println("Your database is empty!!!");
         //System.out.println(element.name + " " + element.ID + " " + element.age);
        }
    }
    
    
    
     public void deletefirst()
    {
     // list.poll();
      list.pollFirst();
     // list.pollLast();
      
      //list.remove(0);
    //  list.remove(info);
 //     list.removeFirst();
    //  list.removeLast();
     System.out.println("Your first data has been deleted successful!\n\n");
    }
     
     public void deleteLast()
     {
         list.pollLast();
         System.out.println("Your Last data has been deleted successful!\n\n");
     }
     public void delete()
     {
         System.out.print("Enter the index number to delete: ");
         System.out.println();
         Scanner scan=new Scanner(System.in);
         int h =scan.nextInt();
         //list.poll();
         list.remove(h);
         System.out.println("Your data has deleted success!\n\n");
     }

     public void clear()
     {
         list.clear();;
          System.out.println("Your data has been successful clear!\n\n");
          System.out.println("Your linked List is Empty!\n\n\n");
     }
    
    
}
