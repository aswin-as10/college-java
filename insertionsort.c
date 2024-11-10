#include<stdio.h>
int main(){
    int A[50],i,j,n,temp;
    printf("\nenter the size of array:");
    scanf("%d",&n);
    printf("\nenter the elements of array");
    for(i=0;i<n;i++){
    scanf("\t%d",&A[i]);
     }
    for(i=1;i<n;i++){
        temp=A[i];
        j=i-1;
        while( j>=0 && A[j]>temp){  
             A[j+1]=A[j];
             j--;
        }
        A[j+1]=temp;
    }
    printf("\nthe sorted array is :");
    for(i=0;i<n;i++){
        printf("\t%d",A[i]);
    }
        
    
}
