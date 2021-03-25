// Circular Linked-Lists - 

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileWriter;

public class LinkedList_Cycle_Detection
{
	private LinkedList_Cycle_Detection()
	{}
	private class Node
	{
		int Data;
		Node Next;
		Node(int Data)
		{
			this.Data=Data;
			Next=null;
		}
	}
	protected static class Linked_List
	{
		static Node Head;
		static Node Tail;
		private Linked_List()
		{
			this.Head=null;
			Tail=null;
		}
		private static void Insert_At_End(int Data)
		{
			LinkedList_Cycle_Detection LCD=new LinkedList_Cycle_Detection();
			Node New_Node=LCD.new Node(Data);
			if(Head==null)
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
				Temp=Temp.Next;
				Tail=Temp;
				System.out.println(Tail.Data+" inserted into the Linked List.");
				//Tail.Next=Head;
			}
		}
		protected static int Print_LinkedList(Node Head) throws Exception
		{
			int Size=0;
			if(Head==null)
			{
				System.out.println("Sorry, the Linked List is empty.");
			}
			else
			{
				Node Temp=Head;
				System.out.println("\nSo, the Contents of the Linked List are - ");
				while(Temp != null)
				{
					Size+=1;
					Thread.sleep(500);
					System.out.print(Temp.Data);
					if(Temp.Next != null)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.println();
					}
					Temp=Temp.Next;
				}
				System.out.println();
			}
			//System.out.println("So, the Size of the Linked List is - "+Size);
			return Size;
		}
		public static boolean Cycle_Detection_1(Node Head)
		{
			Node Fast=Head;
			Node Slow=Head;
			while(Fast != null && Fast.Next != null)
			{
				Fast=Fast.Next.Next;
				Slow=Slow.Next;
				if(Fast == Slow)
				{
					return true;
				}
			}
			return false;
		}
		public static void Cycle_Detection_2(Integer[] Nodes)
		{
			int[] Node=new int[Nodes.length];
			for(int i=0;i<Nodes.length;i++)
			{
				Node[i]=Nodes[i];
			}
			for(int i=0;i<Node.length;i++)
			{
				if(i==0 && Node[i] != 1)
				{
					System.out.println("Sorry, Node-Numbering must start with 1.");
					break;
				}
				else
				{
					int j=1;
					int k=i+j;
					if(i==1 && Node[i]==Node[i-1])
					{
						System.out.println("There is a Self-Loop in the First Node.");
						break;
					}
					if(Node[i] != k && Node[i]>k)
					{
						System.out.println("Sorry, Loop is not possible because - \n"+Node[i-1]+" -> "+Node[i]);
						break;
					}
					if(i>1 && Node[i]<k && Node[i]==Node[i-1])
					{
						System.out.println("There is a Self-Loop from - \n\""+Node[i-1]+" -> "+Node[i]+"\"");
						break;
					}
					if(i>2 && Node[i]<k && Node[i]<Node[i-1])
					{
						System.out.println("Yes, there is a Loop from - \n\""+Node[i-1]+" -> "+Node[i]+"\"");
						break;
					}
					else if(i==(Node.length-1) && Node[i]-Node[i-1]==1)
					{
						System.out.println("The Linked-List is in proper ascending order but there are No Loops.");
					}
				}
			}
		}
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] Arguments) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(System.out));
		bw1.write("Yes, BufferedWriter is working.\n\n");
		bw1.flush();
		FileWriter FW=new FileWriter("D:\\Test.txt");
		BufferedWriter bw2=new BufferedWriter(FW);
		bw2.write("This is a Test File made on Java.");
		bw2.flush();
		
		/*LinkedList_Cycle_Detection LCD=new LinkedList_Cycle_Detection();
		Linked_List LL1=new Linked_List();
		System.out.println("Enter the Size of the Linked List - ");
		int Size=sc.nextInt();
		System.out.println("Enter a Node-Number for forming a Cycle - ");
		int N=sc.nextInt();
		for(int i=1;i<=Size;i++)
		{
			System.out.println("\nEnter Data for Node No. "+i+" - ");
			int Data=sc.nextInt();
			LL1.Insert_At_End(Data);
		}
		int Length=LL1.Print_LinkedList(LL1.Head);
		Node Temp=LL1.Head;
		Node Extra=null;
		for(int i=1;i<=Length;i++)
		{
			if(i==N)
			{
				Extra=Temp;
			}
			if(i<Length)
			{
			Temp=Temp.Next;
			}
		}
		Temp.Next=Extra;
		boolean Result=LL1.Cycle_Detection_1(LL1.Head);
		if(Result == true)
		{
			System.out.println("Cycle exists.");
		}
		else
		{
			System.out.println("Cycle doesnot exist.");
		}*/
		
		/*Linked_List LL2=new Linked_List();
		System.out.println("Enter the number of Nodes in the Linked List - ");
		int N=sc.nextInt();
		System.out.println("Enter "+N+" Nodes in an ascending order.\nFor example \"1 -> 2 -> 3 -> 4 -> 5\" - ");
		String S1=br.readLine();
		String[] S2=S1.split(" ");
		Integer[] Nodes=new Integer[N];
		for(int i=0;i<N;i++)
		{
			Nodes[i]=Integer.parseInt(S2[i]);
		}
		System.out.println("So, the Nodes are - ");
		for(int i=0;i<N;i++)
		{
			System.out.print(Nodes[i]);
			if(i<N-1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.println();
			}
		}
		System.out.println();
		int[] Node_Data=new int[N];
		for(int i=0;i<N;i++)
		{
			if(i>0 && Nodes[i]<=Nodes[i-1])
			{
				for(int j=0;j<N;j++)
				{
					if(Nodes[j] == Nodes[i])
					{
						System.out.println("Node No. "+Nodes[i]+" found at Position No. "+(j+1));
						System.out.println("Node "+Nodes[i]+"'s Data is - "+Node_Data[j]+".\nSo, please insert "+Node_Data[j]);
						break;
					}
				}
			}
			System.out.println("Enter Data for Node No. "+Nodes[i]+" - ");
			Node_Data[i]=sc.nextInt();
		}
		LL2.Cycle_Detection_2(Nodes);*/
		
		Linked_List LL3=new Linked_List();
		LL3.Insert_At_End(10);
		LL3.Insert_At_End(20);
		LL3.Insert_At_End(30);
		LL3.Insert_At_End(40);
		LL3.Insert_At_End(50);
		LL3.Print_LinkedList(LL3.Head);
		LL3.Tail.Next=LL3.Head.Next.Next;    //Enter your Cycle here.
		boolean Result=LL3.Cycle_Detection_1(LL3.Head);
		if(Result == true)
		{
			System.out.println("Yes, Cycle exists.");
		}
		else
		{
			System.out.println("Sorry, Cycle doesnot exist.");
		}
	}
}




