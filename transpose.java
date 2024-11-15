import java.util.Scanner;

public class transpose {
     public static void main(String []args){
    int i,j;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the row and column of matrix");
    int r=obj.nextInt();
    int c=obj.nextInt();
     System.out.println("enter the elements of matrix");
    int a[][]=new int[r][c];
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
             a[i][j]=obj.nextInt();
        }
    }
    int t[][]=new int[c][r];
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            t[j][i]=a[i][j];
        }
    }
    System.out.println("the transpose of matrix is:");
    for(i=0;i<c;i++){
        for(j=0;j<r;j++){
          System.out.print(t[i][j]+" ");
        }
        System.out.println();
    }
}
}
