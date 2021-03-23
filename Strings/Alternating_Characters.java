package Strings;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Alternating_Characters
{
	private Alternating_Characters()
	{}
	
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Arguments) throws IOException, InterruptedException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("Enter a String (for e.g., \"abcdefghij\") - ");
		bw.flush();
//		String S=sc.nextLine().trim();
		String S = br.readLine().trim();
		try
		{
		Thread.sleep(500);
		}
		catch(Exception E)
		{
//			System.out.println(E);
			E.printStackTrace();
		}
		bw.write("\t\tLoading");
		bw.flush();
		Thread.sleep(250);
		for(int i=0;i<3;i++)
		{
			System.out.print('.');
			Thread.sleep(250);
		}
		Thread.sleep(500);
		bw.newLine();
		bw.write("So, the String that you've entered is - "+S);
		bw.newLine();
		bw.flush();
		
		String[] String=new String[S.length()-1];
		Integer[] N1 = new Integer[S.length()-1];
		for(int i=0;i<S.length()-1;i++)
		{
			StringBuilder sb=new StringBuilder();
			char X=S.charAt(i);
			sb.append(X);
			char Y=S.charAt(i+1);
			if(Y == X)
			{
				while(S.charAt(i) == X && i<S.length()-1)
				{
					i+=1;
				}
				if(S.charAt(i) != X)
				{
					Y=S.charAt(i);
					sb.append(Y);
				}
			}
			else
			{
				Y=S.charAt(i+1);
				sb.append(Y);
			}
			for(int j=i+2;j<S.length();j++)
			{
				if(S.charAt(j) == X && j<S.length()-1)
				{
					sb.append(S.charAt(j));
					if(S.charAt(j+1) == Y)
					{
						sb.append(S.charAt(j+1));
					}
					else if(S.charAt(j+1) != Y && (j+1)<S.length())
					{
						while(S.charAt(j) != Y && j<S.length()-1)
						{
							j+=1;
						}
						if(S.charAt(j) == Y)
						{
							sb.append(S.charAt(j));
						}
					}
				}
				else if(S.charAt(j) == X && j==S.length()-1)
				{
					sb.append(S.charAt(j));
				}
			}
			String[i]=sb.toString();
			N1[i]=sb.length();
		}
		bw.write("So, the Strings and their corresponding lengths are - \n");
		bw.newLine();
		bw.flush();
		for(int i=0;i<String.length;i++)
		{
			bw.write("\t"+String[i]+"\t\t"+N1[i]);
			bw.newLine();
			bw.flush();
		}
		int[] N2 = new int[N1.length];
		for(int i=0;i<N1.length;i++)
		{
			if(N1[i] != null)
			{
				N2[i]=N1[i];
			}
		}
		int Max = N2[0];
		for(int i=1;i<N2.length;i++)
		{
			if(N2[i]>Max)
			{
				Max=N2[i];
			}
		}
		bw.write("The length of the longest String of Alternating Characters is - "+Max);
		bw.flush();
	}
}




