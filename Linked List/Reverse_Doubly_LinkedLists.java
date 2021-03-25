// Doubly Linked-Lists - 

import java.util.Scanner;

public class Reverse_Doubly_LinkedLists
{
	private Reverse_Doubly_LinkedLists()
	{
	}

	private static class Node
	{
		int Data;
		Node Previous;
		Node Next;
		
		private Node(int Data)
		{
			this.Data=Data;
			Previous=null;
			this.Next=null;
		}
	}

	private class Linked_List
	{
		Node Head;
		
		private Linked_List()
		{
			Head=null;
		}
		
		private void Insert_At_End(int Data)
		{
			Node New_Node=new Node(Data);
			if(Head == null)
			{
				Head=New_Node;
				System.out.println(Head.Data+" inserted into the Linked List.");
			}
			else
			{
				Node Temp=Head;
				while(Temp.Next != null)
				{
					Temp=Temp.Next;
				}
				Temp.Next=New_Node;
				New_Node.Previous=Temp;
				Node Last=New_Node;
				System.out.println(Last.Data+" inserted into the Linked List.");
			}
		}
		
		private int Print_LinkedList(Node Head)
		{
			if(Head == null)
			{
				System.out.println("Sorry, Linked List is empty.");
				return 0;
			}
			else
			{
				Node Temp=Head;
				int Size=0;
				System.out.println("So, the Contents of the Linked List are - ");
				while(Temp != null)
				{
					Size+=1;
					if(Temp.Next != null)
					{
						System.out.print(Temp.Data+" ");
					}
					else
					{
						System.out.println(Temp.Data);
					}
					Temp=Temp.Next;
				}
				return Size;
			}
		}
		
		private Node Reversed_Doubly_LinkedList(Node Head_1)
		{
			System.out.println("So, the Length of the Linked List is - "+Print_LinkedList(Head_1));
			if(Head_1 == null)
			{
				System.out.println("Sorry, Linked List is empty.");
				return null;
			}
			else
			{
				Node Temp1=Head_1;
				while(Temp1.Next != null)
				{
					Temp1=Temp1.Next;
				}
				Node Head_2=Temp1;
				Node Temp2=Head_2;
				Temp1=Temp1.Previous;
				while(Temp1 != null)
				{
					Temp2.Next=Temp1;
					Temp2=Temp2.Next;
					Temp1=Temp1.Previous;
				}
				Temp2.Next=null;
				return Head_2;
			}
		}
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] Arguments) throws Exception
	{
		Reverse_Doubly_LinkedLists RDL=new Reverse_Doubly_LinkedLists();
		Linked_List LL=RDL.new Linked_List();
		System.out.println("Enter the Size of the Linked List - ");
		int Size=sc.nextInt();
		Thread.sleep(500);
		System.out.println();
		
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter Data for Linked List "+(i+1)+" - ");
			int Data=sc.nextInt();
			Thread.sleep(500);
			LL.Insert_At_End(Data);
		}
		Node New_Head=LL.Reversed_Doubly_LinkedList(LL.Head);
		LL.Print_LinkedList(New_Head);
	}
}




