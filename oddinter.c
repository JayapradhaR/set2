#include<stdio.h>
void main()
{
    int i,m,n;
    scanf("%d%d",&m,&n);
    for(i=m+1;i<n-1;i++)
    {
       if(i%2==1)
       {
           printf("%d\t",i);
       }
    }
}

