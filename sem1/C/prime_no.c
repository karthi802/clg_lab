#include <stdio.h>

int main()
{
    int m,n,i,fact,j;
    scanf("%d%d",&m,&n);
   for(i=m; i<=n; i++)
    {
        fact=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
            printf("%d\n" ,i);
    }
    return 0;
}
