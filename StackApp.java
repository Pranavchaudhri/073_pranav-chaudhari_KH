import static java.lang.System.exit;

class StackLL{
private class Node{
int data;
Node link;
}
Node top;

StackLL()
{
this.top=null;
}
public void push(int x)
{
Node temp=new Node();
if(temp==null)
{
System.out.println("overflow");

return;
}
temp.data=x;
temp.link=top;
top=temp;
}
public boolean isEmpty()
{
return top==null;
}

public int peek()
{
if (!isEmpty())
{return top.data;
}
else{
System.out.println("stack is empty");
return -1;

}
}
public void pop()
{
if(top==null)
{
System.out.println("underflow");
return ;
}
top=(top).link;
}
public void display()
{
if(top==null){
System.out.println("underflow");
exit(1);
}
else{
Node temp=top;
while(temp!=null){
System.out.printf("%d->",temp.data);
temp=temp.link;
}
}
}

public static void main(String args[])

{
StackLL s1=new StackLL();
s1.push(5);
s1.push(10);
s1.push(15);
s1.push(11);
s1.push(7);
s1.push(40);
s1.display();


}
}