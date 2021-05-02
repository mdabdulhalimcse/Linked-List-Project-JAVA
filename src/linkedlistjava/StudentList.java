
package linkedlistjava;


import java.util.LinkedList;
import java.util.Scanner;



public class StudentList {
    public static void main(String[] args) {
        
        
        int n,i;
        
        
        int f = 1;
       
        while(f==1){
            System.out.println("Enter 1 to add a data at first");
        System.out.println("Enter 2 to add a data at last");
        System.out.println("Enter 3 to add a data by index");
        System.out.println("Enter 4 to remove a data at first");
        System.out.println("Enter 5 to remove a data at last");
        System.out.println("Enter 6 to remove a data by index");
        System.out.println("Enter 7 to display database");
        System.out.println("Enter 0 to exit");
        
        System.out.print("Enter your choice: ");
        
        Scanner s=new Scanner(System.in);
        
        int c=s.nextInt();
            switch(c)
        {
            case 1: 
            {
                inserts p=new inserts();
                    p.insert();
                    break;
            }
            
            
            
            case 2: System.out.println("End");
                     break;
            
            case 7: 
            {
                inserts p=new inserts();
                
                break;
            }
             
        }
            System.out.println("To continue press 1: ");
            Scanner scan1=new Scanner(System.in);
           f= scan1.nextInt();
                   
        }
        
        
    }

    
}
