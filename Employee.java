import java.util.Scanner;
 class Person
{
    
    String Name;
    String Address;
    String gender;
    int age;

  
}
public class Employee extends Person 
{
 int empid; 
String cname;
String qual;
double salary;

  Employee(int no, String na,String ql, double sal) 
  {
        this.Empid = no;
        this.cname = na;
	this.qual = ql;
        this.Salary = sal;
        
    }
}
 
public class Teacher extends Employee
{
 String dept;
 String subject;

    Teacher(int no, String na, double sal, String ql, String dep, String sub)
{
     super(no,na,ql,sal);
     this.dept= dep;
     this.subject=sub;
 }
}
 void display(){
    System.out.println("Name: "+Name);
    System.out.println("Address: "+Address);
    System.out.println("Gender "+gender);
    System.out.println("Age: "+age);
    System.out.println("Employee id: "+empid);
    System.out.println("Company Name: "+cname);
    System.out.println("Salary: "+salary);
    System.out.println("Qualification: "+qual);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
 }
 public static void main(String[] args) {
    System.out.println("\nEnter the No. of Employee's");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Teacher arr[]=new Teacher[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Employee id: ");
        int empid=sc.nextInt();
        System.out.println("\nEnter Employee Name: ");
        String Name=sc.next();
	System.out.println("\nEnter Company Name: ");
        String cname=sc.next();
	System.out.println("\nEnter qualification ");
        String qual=sc.next();
        System.out.println("\nEnter Salary: ");
        double salary=sc.nextDouble();
        System.out.println("\nEnter Address: ");
        String Address=sc.next();
        System.out.println("\nEnter department: ");
        String dept=sc.next();
        System.out.println("\nEnter Subject: ");
        String subject=sc.next();
       arr[i]=new Teacher(empid,Name,cname,qual,salary,Address,dept,subject);
   

    }
    System.out.println("\n********Informations of all the employee's************");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }
 sc1.close();
 }


}
