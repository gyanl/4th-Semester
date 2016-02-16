//Reverse a number using classes 

#include<iostream.h>
#include<conio.h>
class Reversal
{
public:
int d,r,n;
void getdata();
void ans();
};

void Reversal::getdata()
{
cout<<"Enter a number : ";
cin>>n;
}
void Reversal::ans()
{
r=0;
while(n>0)
{
d=n%10;
r=r*10+d;
n=n/10;
}
cout<<"Reverse of the number is : "<<r;
}
void main()
{
clrscr();
Reversal r;
r.getdata();
r.ans();
getch();
}
