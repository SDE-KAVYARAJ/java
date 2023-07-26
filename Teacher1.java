import java.util.Scanner;
 class Person
{
    
    String Name;
    String Address;
    String gender;
    int age;
Person(String nam, String add,String gn, int ag) 
  {
        
        this.Name = nam;
        this.Address = add;
	this.gender = gn;
        this.age = ag;
        
    }
  
}
 class Employee extends Person 
{
 int empid; 
String cname;
String qual;
double salary;

  Employee(String nam, String add,String gn, int ag,int no, String na,String ql, double sal) 
  {
        super(nam,add,gn,ag);
        this.empid = no;
        this.cname = na;
	this.qual = ql;
        this.salary = sal;
        
    }
}
 
 class Teacher1 extends Employee
{
 String dept;
 String subject;

    Teacher1(String nam, String add,String gn, int ag,int no, String na, double sal, String ql, String dep, String sub)
{
     super(nam,add,gn,ag,no,na,ql,sal);
     this.dept= dep;
     this.subject=sub;
 }

 void display()
{
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
 public static void main(String[] args) 
{
    System.out.println("\nEnter the No. of Employee's");
    Scanner sc1 = new Scanner(System.in);

    int num = sc1.nextInt();
    Teacher1 arr[]=new Teacher1[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Employee id: ");
        int empid=sc.nextInt();
        System.out.println("\nEnter Employee Name: ");  
	String Name=sc.next();
	
	System.out.println("\nEnter Address: ");
        String Address=sc.next();

	System.out.println("\nEnter Gender: ");
        String gender=sc.next();

	System.out.println("\nEnter age: ");
	int age=sc.nextInt();

	System.out.println("\nEnter qualification ");
        String qual=sc.next();
        
      System.out.println("\nEnter Company Name: ");
        String cname=sc.next();
	
        System.out.println("\nEnter Salary: ");
        double salary=sc.nextDouble();
        
        System.out.println("\nEnter department: ");
        String dept=sc.next();

        System.out.println("\nEnter Subject: ");
        String subject=sc.next();

       arr[i]=new Teacher1(Name,Address,gender,age,empid,cname,salary,qual,dept,subject);
   

    }
    System.out.println("\nInformations of all the employee's");
    for(int i=0;i<num;i++)
	{
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 	}

 }
}



