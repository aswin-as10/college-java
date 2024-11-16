import java.util.Scanner;
public class frequency {
    public static void main(String []args){
        int f=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String s=obj.nextLine();
        int n=s.length();
        System.out.println("enter a letter");
        char c=obj.next().charAt(0);
        for(int i=0;i<n;i++){
           if(c==s.charAt(i)){
            f=f+1;
           }
        }
        System.out.println("frequency is"+f);
    }
}
