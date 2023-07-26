import java.util.Scanner;
 
class BuiltinFns{
  
public static void main(String args[]){ 
int choice; 
   
   Scanner sc = new Scanner(System.in);
      
 System.out.println("STRING CLASS METHODS\n");

System.out.println("1.concat\n2.length\n3.covert to Uppercase \n4.replace\n5.covert a string to Character array \nexit\n");
System.out.println("enter your choice");
choice=sc.nextInt();


 switch(choice)
{
  case 1:System.out.println("Concatenate two strings:");
	System.out.println("Enter  first name \n");
       String fname = sc.nextLine();
       System.out.println("Enter last name: \n");
       String lname = sc.nextLine();
       System.out.println(fname.concat(lname));
	break;
}

  


   




    }  
    }  
