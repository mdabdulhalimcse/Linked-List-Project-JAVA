package linkedlistjava;

import java.util.LinkedList;
import java.util.Scanner;
public class inserts {
    
    public static void insert()
{
        LinkedList<student> list = new LinkedList<student>();
        
        System.out.println("Print something: ");
        
        Scanner scan= new Scanner(System.in);
        String name=scan.nextLine();
        String id=scan.nextLine();
        double cgpa=scan.nextDouble();
        
        System.out.println("Enter the total number of database: ");
        
        int x=scan.nextInt();
        
        int a[]=new int[100];
        
        for(int i=0; i<x; i++){
            
            student a[i]=new student(name,id,cgpa);
       
            list.add(a[i]);
        }
        
        
        
        System.out.println("Press 1 to add more or Press 0 to go HOME");
        
        int n=scan.nextInt();
        
        if(n==1){
            
            inserts p=new inserts();
                p.insert();  
                
        }
        
        else if(n==0){
            String[] arguments = new String[] {"123"};
           StudentList.main(arguments);
        }
        
        for(student s: list){
            System.out.println(s.name +"  "+ s.id +"  "+ s.cgpa);
        }
       
    }
    
}

