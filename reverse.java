import java.util.Scanner;
public class reverse {
    public static void main(String[]args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the string");
    String s=obj.nextLine();
    int n=s.length();
    String rev="";
    for(int i=n-1;i>=0;i--){
        rev=rev+s.charAt(i);
    }
    System.out.println("the reversed string is "+rev);

    }
    
}
