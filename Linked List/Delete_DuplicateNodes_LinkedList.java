import java.util.Scanner;

public class Delete_DuplicateNodes_LinkedList
{
	private static class Node
	{
		int Data;
		Node Next;
		private Node(int Data)
		{
			this.Data=Data;
			this.Next=null;
		}
	}
	protected static class Linked_List
	{
		Node Head;
		protected Linked_List()
		{
			this.Head=null;
		}
		public void Insert_At_Last(int Data)
		{
			Node New_Node=new Node(Data);
			Node Last=null;
			if(Head==null)
			{
				Head=New_Node;
				System.out.println(Head.Data+" inserted into the Linked List.");
			}
			else
			{
				Node Temp=Head;
				while(Temp.Next!=null)
				{
					Temp=Temp.Next;
				}
				Temp.Next=New_Node;
				Temp=Temp.Next;
				Last=Temp;
				System.out.println(Last.Data+" inserted into the Linked List.");
			}
			return ;
		}
		protected static void Print_LinkedList(Node Head) throws Exception
		{
			if(Head==null)
			{
				System.out.println("Sorry, Linked List is empty.");
			}
			else
			{
				Node Temp=Head;
				System.out.println("So, the Contents of the Linked List are - ");
				while(Temp!=null)
				{
					Thread.sleep(500);
					System.out.print(Temp.Data +" ");
					Temp=Temp.Next;
				}
				System.out.println();
			}
		}
		private static Node Delete_DuplicateNodes(Node Head) throws Exception
		{
			if(Head==null)
			{
				System.out.println("Sorry, Linked List is empty.");
				return Head;
			}
			else
			{
			Node Temp1=Head;
			Node H,Temp2;
			while(Temp1.Next != null && Temp1.Data == Temp1.Next.Data)
			{
				Temp1=Temp1.Next;
			}
			H=Temp1;
			if(Temp1.Next != null)
			{
			Temp1=Temp1.Next;
			Temp2=H;
			while(Temp1.Next != null)
			{
				if(Temp1.Data == Temp1.Next.Data)
				{
					Temp1=Temp1.Next;
				}
				else if(Temp1.Data != Temp1.Next.Data)
				{
					Temp2.Next=Temp1;
					Temp2=Temp2.Next;
					Temp1=Temp1.Next;
				}
			}
			if(Temp1.Data != Temp2.Data && Temp1.Next == null)
			{
				Temp2.Next=Temp1;
				Temp2=Temp2.Next;
			}
			}
			Node Temp3=H;
			System.out.println("So, the final Contents of the Linked List are - ");
			while(Temp3 != null)
			{
				Thread.sleep(500);
				System.out.print(Temp3.Data+" ");
				Temp3=Temp3.Next;
			}
			System.out.println();
			return H;
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] Arguments) throws Exception
	{
		Delete_DuplicateNodes_LinkedList DDL=new Delete_DuplicateNodes_LinkedList();
		Linked_List LL1=new Linked_List();
		System.out.print("Enter the Size of the Linked List - ");
		Integer Size=sc.nextInt();
		System.out.println("Enter "+Size+" elements into the Linked List - ");
		for(Integer i=1;i<=Size;i++)
		{
			int Data=sc.nextInt();
			LL1.Insert_At_Last(Data);
		}
		LL1.Print_LinkedList(LL1.Head);
		LL1.Delete_DuplicateNodes(LL1.Head);
	}
}




