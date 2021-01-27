#include<stdio.h>

float diameter(int r)
{
    float dia;
    dia = 2 * r;
    return dia;
}

float circumference(int r)
{
    float circum;
    circum =(float) 2 * 3.14 * r;
    return circum;
}

float area(int r)
{
    float area;
    area = 3.14 * (r*r) ;
    return area;
}

int main()
{
    int a;
    float b,c,d;
    scanf("%d",&a);
    b = diameter(a);
    c = circumference(a);
    d = area(a);
    printf("Diameter Of a Circle = %0.2f\n",b);
    printf("\n Circumference Of a Circle = %0.2f\n",c);
    printf("\n Area Of a Circle = %0.2f",d);
    
    return 0;
}
