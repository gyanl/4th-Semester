//Find factorial of a number using classes.

#include<iostream.h>
#include<conio.h>
class Factorial
{
public:
int a,f;
void getdata();
void ans();
};

void Factorial::getdata()
{
cout<<"Enter a number : ";
cin>>a;
}

void Factorial::ans()
{
f=1;
for(int i=1;i<=a;i++)
{
f=f*i;
}
cout<<"Factorial of the number is : "<<f;
}

void main()
{
clrscr();
Factorial f;
f.getdata();
f.ans();
getch();
}
