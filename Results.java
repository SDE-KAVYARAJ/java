import java.util.Scanner;
 
 class Student {
	int rollno;
	String name;
	String std;

Student(int rl,String na,String sd)
{
	rollno=rl;
	name=na;
	std=sd;
}

}
 class Sports extends Student
{
	String item;
	String pos;
Sports(int rl,String na,String sd,String it,String p){
	super(rl,na,sd);
	item=it;
	pos=p;
}
}

 class Results extends Sports
{
	String res;
 Results(int rl,String na,String sd,String it,String p,String r)
{
	super(rl,na,sd,it,p);
	res=r;
}
  void display()
{
    System.out.println("Rollno: "+rollno);
    System.out.println("Name: "+name);
    System.out.println("Std: "+std);
    System.out.println("Sports Item: "+item);
    System.out.println("Position: "+pos);
    System.out.println("Result: "+res);
 }
public static void main (String args[])
{
    System.out.println("\nEnter the No. of Students");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Results arr[]=new Results[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter rollno: ");
        int rollno=sc.nextInt();
        System.out.println("\nEnter Name: ");
        String name=sc.next();
        System.out.println("\nEnter Standard: ");
        String std=sc.next();
        System.out.println("\nEnterSports item ");
        String item=sc.next();
        System.out.println("\nEnter position ");
        String pos=sc.next();
        System.out.println("\nEnter Result");
        String res=sc.next();
        arr[i]=new Results(rollno,name,std,item,pos,res);
    

    }
    System.out.println("\nInformations of all the students\n");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }

 }
}


