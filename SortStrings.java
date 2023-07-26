import java.util.Scanner;
public class SortStrings
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner s1 = new Scanner(System.in);
        
    
        System.out.print("Enter number of strings you would like to enter:");
        count = s1.nextInt();
        
        
        String str[] = new String[count];
        Scanner s2 = new Scanner(System.in);
        
        
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = s2.nextLine();
        }
       
        
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
       
        System.out.print(" Sorted Strings\n");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + "\n ");
        }
    }
}
