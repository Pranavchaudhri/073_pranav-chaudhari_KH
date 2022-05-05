import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.security.*;

public class Reverse{

static class SinglyLinkedListNode{
public int data;
public SinglyLinkedListNode Next;

public SinglyLinkedListNode(int nodeData)
{
this.data=nodeData;
this.next=null;
}
}

static class SinglyLinkedListNode{
  public SinglyLinkedListNode head;
  public SinglyLinkedListNode tail;
 public SinglyLinkedListNode(){
this.head=null;
this.tail=null;
}
public void insertNode(int nodeData){
 SinglyLinkedListNode node=new SinglyLinkedListNode(nodeData);
 if(this.head==null)
 {
 this.head=node;
 }else{
 this.tail.next=node;
 }
 this.tail=node;
 }
 public static void printSinglyLinkedList(SinglyLinkedListNode,String sep)
 {
 while(node!=null){
 System.out.println(node.data);
 node=node.next;
 if(node!=null)
 {
 System.out.print(sep);
 }
 }
 }
 static void reversePrint(SinglyLinkedListNode head){
 if (head.next!=null){
 reversePrint(head.next);
 }
 System.out.println(head.data);
 }
 
 private static final Scanner scanner =new Scanner (System.in);
 public static void main(String args[])
 {
 int tests=scanner.nextInt();
 scanner.skip("reverse the string");
 for(int testsItr=0;testItr<tests;testItr++)
 {
 SinglyLinkedList llist=new SinglyLinkedList();
 int llistCount=scanner.nextInt();
 scanner.skip("string");
 for(int i=0;i<llistCount;i++);{
	 
 int llistItem=scanner.nextInt();
 scanner.skip("reverse");
 llist.insertNode(llistItem);
 }
 reversePrint(llist.head);
 }
 scanner.close();
 }
 }
}

 
 
 