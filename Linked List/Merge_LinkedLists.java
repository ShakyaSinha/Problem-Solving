import java.util.Scanner;

public class Merge_LinkedLists
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
	protected class Linked_List
	{
		Node Head;
		protected Linked_List()
		{
			this.Head=null;
		}
		private Node Insert_At_End(int Data) throws Exception
		{
			Merge_LinkedLists MLL=new Merge_LinkedLists();
			Node New_Node =new Node(Data); //MLL is not used as Node Class is Static.
			Node Last;
			if(Head==null)
			{
				Head=New_Node;
				Head.Next=null;
				Thread.sleep(500);
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
				Last=New_Node;
				Last.Next=null;
				Thread.sleep(500);
				System.out.println(Last.Data+" inserted into the Linked List.");
			}
			return Head;
		}
		protected Node Print_LinkedList(Node head,String S) throws Exception
		{
			Node Last=null;
			if(head==null)
			{
				Thread.sleep(500);
				System.out.println("Sorry, Linked List is Empty.");
			}
			else
			{
				System.out.println(S);
				Node Temp=head;
				while(Temp!=null)
				{
					Last=Temp;
					Thread.sleep(500);
					System.out.print(Temp.Data+"\t");
					Temp=Temp.Next;
				}
				Thread.sleep(500);
				System.out.println();
				Thread.sleep(500);
				System.out.println("The Value of the Head Node is - "+head.Data);
			}
			return Last;
		}
		public Linked_List Merge(Linked_List L1,Linked_List L2) throws Exception
		{
			Merge_LinkedLists MLL=new Merge_LinkedLists();
			Linked_List L3=MLL.new Linked_List();
			L3=L1;
			Node Temp=L3.Head;
			while(Temp.Next!=null)
			{
				Temp=Temp.Next;
			}
			Temp.Next=L2.Head;
			return L3;
		}
	}
	
	static final Scanner sc=new Scanner(System.in);
	
	public static void main(String[] Arguments) throws Exception
	{
		Merge_LinkedLists MLL=new Merge_LinkedLists();
		Node Last;
		
		//Taking input of 2 Linked Lists - 
		
		for(int i=1;i<=1;i++)
		{
			Node H=null;	//H -> Head
			Linked_List LL1=MLL.new Linked_List();
			int x=i;
			Thread.sleep(500);
			System.out.println("Enter the Size of Linked List "+x+" - ");
			int Size1=sc.nextInt();
			for(int j=0;j<Size1;j++)
			{
				int k=j;
				Thread.sleep(500);
				System.out.println("Enter Element No "+(++k)+" for Linked List "+x+" - ");
				int Data=sc.nextInt();
				H=LL1.Insert_At_End(Data);
			}
			Linked_List LL2=MLL.new Linked_List();
			Thread.sleep(500);
			System.out.println("Enter the Size of Linked List "+(++x)+" - ");
			int Size2=sc.nextInt();
			for(int j=0;j<Size2;j++)
			{
				int k=j;
				Thread.sleep(500);
				System.out.println("Enter Element No "+(++k)+" for Linked List "+x+" - ");
				int Data=sc.nextInt();
				LL2.Insert_At_End(Data);
			}
			Last=LL1.Print_LinkedList(H,"The Contents of Linked List "+(--x)+" are - ");
			Thread.sleep(500);
			System.out.println("The Value of the Last Node of Linked List "+(x)+" is - "+Last.Data);
			Last=LL2.Print_LinkedList(LL2.Head,"The Contents of Linked List "+(++x)+" are - ");
			Thread.sleep(500);
			System.out.println("The Value of the Last Node of Linked List "+(x)+" is - "+Last.Data);
			Linked_List LL=MLL.new Linked_List();
			Linked_List LL3=LL.Merge(LL1,LL2);
			LL3.Print_LinkedList(LL3.Head,"So, the Contents of Merged Linked List are - ");
		}
	}
}




