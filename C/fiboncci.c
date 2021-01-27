#include<stdio.h>

int main()
{
    int fib1,fib2;
    int n,i=1;
    scanf("%d",&n);
    
    fib1 = 0;
    fib2 = 1;
    
    while(i<=n)
    {
        printf("%d\n",fib1);
        fib2 = fib1+fib2;
        fib1 = fib2-fib1;
        i++;
    }
    
    return 0;     
}
