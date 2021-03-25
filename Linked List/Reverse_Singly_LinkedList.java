import java.util.Scanner;

public class Reverse_Singly_LinkedList
{
	private static class Node
	{
		int Data;
		Node Next;
		public Node(int Data)
		{
			this.Data=Data;
			this.Next=null;
		}
	}
	
	static Node Head=null;
	
	private static void Insert_At_Last(int Data)
	{
		Node New_Node = new Node(Data);
		if(Head==null)
		{
			Head=New_Node;
			Head.Next=null;
			System.out.println("\n"+Head.Data+" inserted into the Linked List at Location 1.\n");
		}
		else
		{
			Node Temp=Head;
			int Count=2;
			while(Temp.Next!=null)
			{
				Temp=Temp.Next;
				Count+=1;
			}
			Node Last=Temp;
			Last.Next=New_Node;
			Last=New_Node;
			Last.Next=null;
			System.out.println("\n"+Last.Data+" inserted into the Linked List at Location "+Count+".\n");
		}
	}
	
	protected static void Print_Singly_LinkedList() throws Exception
	{
		if(Head==null)
		{
			System.out.println("Sorry, Linked List is empty.");
		}
		else
		{
			Node Temp=Head;
			Thread.sleep(500);
			System.out.println("So, the elements in the Linked List are - \n");
			while(Temp!=null)
			{
				Thread.sleep(500);
				System.out.print(Temp.Data+" ");
				Temp=Temp.Next;
			}
			System.out.println();
		}
	}
	
	private static int Size()
	{
		int Count=0;
		Node Temp=Head;
		while(Temp!=null)
		{
			Count+=1;
			Temp=Temp.Next;
		}
		return Count;
	}
	
	public static void Print_Reversed_LinkedList() throws Exception
	{
		System.out.println("So, the contents of the Reversed Linked List are - \n");
		for(int i=(Size()-1);i>=0;i--)
		{
			if(i==0)
			{
				Thread.sleep(500);
				System.out.print(Head.Data);
			}
			else if(i>0)
			{
			Node Temp=Head;
			int x=i;
			while(x>=1)
			{
				Temp=Temp.Next;
				x-=1;
			}
			Thread.sleep(500);
			System.out.print(Temp.Data+" ");
			}
		}
		System.out.println();
	}
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] Arguments) throws Exception
	{
		System.out.println("Please enter how many elements you want to insert inside the Linked List - ");
		int Size=sc.nextInt();
		
		Reverse_Singly_LinkedList RSL = new Reverse_Singly_LinkedList();
		
		for(int i=1;i<=Size;i++)
		{
			int x=i;
			System.out.println("\nPlease enter Element No. "+x+" - \n");
			int Data=sc.nextInt();
			RSL.Insert_At_Last(Data);
		}
		RSL.Print_Singly_LinkedList();
		int Size_of_LinkedList=RSL.Size();
		System.out.println("\nSo, the Size of the Linked List is - "+Size_of_LinkedList+"\n");
		RSL.Print_Reversed_LinkedList();
	}
}




