
package libradilla.it2c;

import java.util.Scanner;


public class Class {
    
    public void schoolar(){
        
        Classes[] scl = new Classes[100];
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of Applicants: ");
        int nums  = sc.nextInt();
        
                for(int i=0; i < nums; i++){
            System.out.println("Enter details of Applicants " + (i+1)+":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("GPA: ");
            double gpa = sc.nextDouble();
            System.out.println("Annual Family Income: ");
            int income = sc.nextInt();
            System.out.println("Community Service Hours: ");
            int hours = sc.nextInt();
            scl[i] = new Classes();
            scl[i].addDetails(id, name, gpa, income, hours);
    
}
                
                for(int i=0; i < nums; i++){
            scl[i].viewDetails();
    
}
    }
}
