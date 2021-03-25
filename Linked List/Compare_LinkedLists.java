import java.util.Scanner;

public class Compare_LinkedLists
{
	class Node
	{
		int Data;
		Node Next;
		Node(int Data)
		{
			this.Data=Data;
			this.Next=null;
		}
	}
	class Linked_List
	{
		Node Head;
		protected Linked_List()
		{
			this.Head=null;
		}
	protected Node Insert_At_First(int Data)
	{
		Node New_Node = new Node(Data);
		if(Head==null)
		{
			Head=New_Node;
			Head.Next=null;
			System.out.println(Head.Data+" inserted into the Linked List.");
		}
		else
		{
			New_Node.Next=Head;
			Head=New_Node;
			Head.Next=New_Node.Next;
			System.out.println(Head.Data+" inserted into the Linked List.");
		}
		return Head;
	}
	public Node Insert_At_End(int Data)
	{
		Node New_Node=new Node(Data);
		if(Head==null)
		{
			Head=New_Node;
			Head.Next=null;
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
			Node Last=New_Node;
			Last.Next=null;
			System.out.println(Last.Data+" inserted into the Linked List.");
		}
		return Head;
	}
	int Size(Node Head)
	{
		if(Head==null)
		{
			return 0;
		}
		else
		{
			Node Temp=Head;
			int Size=0;
			while(Temp!=null)
			{
				Size+=1;
				Temp=Temp.Next;
			}
			return Size;
		}
	}
	private Node Print_LinkedList(String S) throws Exception
	{
		System.out.println(S);
		if(Head==null)
		{
			System.out.println("Sorry, Linked List is empty.");
		}
		else
		{
			Node Temp=Head;
			while(Temp != null)
			{
				Thread.sleep(500);
				System.out.print(Temp.Data+" ");
				Temp=Temp.Next;
			}
			System.out.println();
		}
		return Head;
	}
	boolean Compare(Node Head1,Node Head2)
	{
		Node Temp1=Head1;
		Node Temp2=Head2;
		while(Temp1!=null && Temp2!=null && Temp1.Data==Temp2.Data)
		{
			Temp1=Temp1.Next;
			Temp2=Temp2.Next;
		}
		return Temp1==Temp2;
	}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] Arguments) throws Exception
	{
		System.out.println("Enter the number of Linked Lists you want to Make - ");
		int Number=sc.nextInt();
		Compare_LinkedLists CLL=new Compare_LinkedLists();
		for (int i=1;i<=Number;i++)
		{
		Node Head;
		Linked_List LL=CLL.new Linked_List();
		System.out.println("Enter the Size of Linked List "+i+" - ");
		int Size=sc.nextInt();
		for(int j=0;j<Size;j++)
		{
			int x=j;
			System.out.println("Enter Element No. "+(x+1)+" for Linked List "+i+" - ");
			int Element=sc.nextInt();
			LL.Insert_At_End(Element);
		}
		Head=LL.Print_LinkedList("So, the Content of Linked List "+i+" is - ");
		Thread.sleep(500);
		System.out.println("The Value of Head of Linked List "+i+" is - "+Head.Data);
		}
		
		/*Thread.sleep(500);
		LL.Insert_At_First(20);
		LL.Print_LinkedList();
		System.out.println("Enter any Number - ");
		int N=sc.nextInt();
		LL.Insert_At_First(N);
		LL.Print_LinkedList();*/
		
		//Taking 2 Lists to Compare.
		
		System.out.println("\n-------XXX-------\n");
		Linked_List LL=CLL.new Linked_List();
		for(int i=1;i<2;i++)
		{
		int k=i;
		Linked_List List1=CLL.new Linked_List();
		System.out.println("Enter the Size of Linked List "+(k++)+" - ");
		int Size1=sc.nextInt();
		for(int j=0;j<Size1;j++)
		{
			int x=j;
			System.out.println("Enter Element No. "+(++x)+" for Linked List "+i+" - ");
			int Data=sc.nextInt();
			List1.Insert_At_End(Data);
		}
		Linked_List List2=CLL.new Linked_List();
		System.out.println("Enter the Size of Linked List "+k+" - ");
		int Size2=sc.nextInt();
		for(int j=0;j<Size2;j++)
		{
			int x=j;
			System.out.println("Enter Element No. "+(++x)+" for Linked List "+k+" - ");
			int Data=sc.nextInt();
			List2.Insert_At_End(Data);
		}
		Node Head1=List1.Print_LinkedList("So, the Content of Linked List "+(i++)+" is - ");
		Node Head2=List2.Print_LinkedList("So, the Content of Linked List "+(i)+" is - ");
		System.out.println("The Sizes of Linked List "+(--i)+" and Linked List "+(++i)+" are - \n"+List1.Size(Head1)+" and "+List2.Size(Head2));
		boolean Result=LL.Compare(List1.Head,List2.Head);
		if(Result==true)
		{
			System.out.println("The Linked Lists are Similar.");
		}
		else
		{
			System.out.println("The Linked Lists are not Similar.");
		}
		}
		LL.Insert_At_First(20);
		LL.Insert_At_First(10);
		LL.Insert_At_End(30);
		LL.Insert_At_End(40);
		LL.Insert_At_End(50);
		LL.Print_LinkedList("The Contents of this Linked List are - ");
		System.out.println("The Size of this Linked List is - "+LL.Size(LL.Head));
	}
}




