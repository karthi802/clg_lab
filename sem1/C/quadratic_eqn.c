#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
    int a,b,c,dis;
    double root1,root2;
    
    scanf("%d%d%d",&a,&b,&c);
    dis = (b*b) - (4*a*c);
    
    if(dis>0)
    {
        root1 = (-b + pow(dis,(1/2)))/(2*a);
        root2 = (-b - pow(dis,(1/2)))/(2*a);
        printf("%.2lf\n%.2lf",root1,root2);
    }
    else
    {
        root1 = -b/(2*a);
        root2 = root1;
        printf("%.2lf\n%.2lf",root1,root2);
    }
    
    return 0;
}
