import java.util.Scanner;
public class matrixmul {
    public static void main(String []args){
    int i,j;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the row and colum of first and second matrix");
    int r1=obj.nextInt();
    int c1=obj.nextInt();
    int r2=obj.nextInt();
    int c2=obj.nextInt();
    if(c1!=r2){
        System.out.println("multiplication not possible");
    }
    else{
        System.out.println("enter the elements of matrix 1");
        int A[][]=new int[r1][c1];
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                A[i][j]=obj.nextInt();
            }
        }
        System.out.println("enter the elements of matrix 2");
        int B[][]=new int[r2][c2];
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                B[i][j]=obj.nextInt();
            }
        }
        int C[][]=new int[r1][c2];
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                C[i][j]=0;
                for(int k=0;k<c1;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

    
       System.out.println("Result matrix:");
       for(i=0;i<r1;i++){
        for(j=0;j<c2;j++){
            System.out.print(C[i][j]+" ");
        }
        System.out.println();
     }
    }
    }
}
