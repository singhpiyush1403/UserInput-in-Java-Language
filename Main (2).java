import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        System.out.print("enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        
        System.out.print("enter your gender :");
        char gender = sc.next().charAt(0);
        
        System.out.print("enter youe phone number :");
        Long phonenumber = sc.nextLong();
        
        System.out.println("Name :" + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("phone number: " + phonenumber);
    
    }
}