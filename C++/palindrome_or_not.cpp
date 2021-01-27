#include<iostream>

using namespace std;

int main()
{
    int a,n,rev=0,temp;
    cin>>a;
    
    n = a;
    
    while(a != 0)
    {
        temp = a % 10;
        rev = (rev*10) + temp;
        a /= 10;
    }
    
    if(n == rev)
    {
        printf("Palindrome");
    }
    else
    {
        printf("Not a palindrome");
    }
    return 0;
}
