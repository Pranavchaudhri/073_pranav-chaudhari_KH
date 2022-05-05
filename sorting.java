import java.util.*;
class sorting
{
void Selectionsort(int a1[])
{
int n=a1.length;
for(int i=0;i<n-1;i++)
{
int min=i;
for(int j=i+1;j<n;j++)
{
if(a1[j]<a1[min])
min=j;	
	
}
int temp=a1[min];
a1[min]=a1[i];
a1[i]=temp;
}
}

void display(int a1[])
{
int n=a1.length;
for(int i=0;i<n;i++)
{
System.out.print(a1[i]+"");
}

}

public static void main(String args[])

{
Sorting s1=new Sorting();
int a1[]={1,2,4,5,3};
s1.Selectionsort(a1);
s1.display(a1);

}

}