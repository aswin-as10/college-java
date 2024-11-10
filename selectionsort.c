#include<stdio.h>
int main(){
    int i,j,n,A[50],temp;
    printf("\nenter the size of array");
    scanf("%d",&n);
    printf("\nenter the elements:");
    for(i=0;i<n;i++)
      {
        scanf("%d",&A[i]);
      }
    printf("\nthe  array is:");
    for(i=0;i<n;i++){
        printf("\t%d",A[i]);
      }
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(A[i]>A[j])
               {
                   temp=A[j];
                   A[j]=A[i];
                   A[i]=temp;
               }
        }
    }
    printf("\nthe sorted array is:");
    for(i=0;i<n;i++){
        printf("\t%d",A[i]);
    }
}
