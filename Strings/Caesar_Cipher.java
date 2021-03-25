package Strings;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.String;

class A
{
	public A()
	{}

	protected static void Method_1()
	{
		System.out.println("This is Method 1 of Class A");
	}

	protected int Method_2(int N)
	{
		System.out.println("So, this is the Method 2 of Class A and the number is - "+N);
		return N;
	}
}

final class B extends A
{
	protected B()
	{}

	@Override
	protected int Method_2(int X)
	{
		System.out.println("So, this is the Method 2 of Class B and the number is - "+X);
		return X;
	}

	private static final void Method_3()
	{
		System.out.println("This is Method 3 of Class B");
	}
}

public final class Caesar_Cipher
{
	private Caesar_Cipher()
	{}

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] Arguments) throws IOException, InterruptedException
	{
//		A a = new A();
//		B b = new B();
//		A c = new B();
//		a.Method_2(5);
//		b.Method_2(10);
//		c.Method_2(20);
//		int Number = c.Method_2(20);
//		System.out.println("The Number is - "+Number);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("Enter a String (use any Special Character and not spaces) - ");
		bw.flush();
		String[] String = br.readLine().trim().split(" ");
		bw.write("So, the String that you've entered is - ");
		bw.flush();
		for(int i=0;i<String.length;i++)
		{
			if(i < String.length-1)
			{
			bw.write(String[i]+" ");
			bw.flush();
			}
			else if(i == String.length-1)
			{
				bw.write(String[i]);
				bw.flush();
			}
		}
		bw.newLine();
		
		String S = String[0];
		bw.write("So, the String that we need to encrypt is - "+S);
		bw.newLine();
		bw.flush();
		
		bw.write("Enter the number of Rotations you want to perform - ");
		bw.flush();
		int R = Integer.parseInt(br.readLine().trim());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<S.length();i++)
        {
            char X = S.charAt(i);
            if(X >= 33 && X <= 47 || X >= 58 && X <= 64 || X >= 91 && X <= 96 || X >= 123 && X <= 126)
            {
                sb.append(X);
            }
            else
            {
            int j=0;
            while(j < R)
            {
                if(X >= 65 && X < 90 || X >= 97 && X < 122)
                {
                    X+=1;
                }
                else if(X == 90)
                {
                    X=65;
                }
                else if(X == 122)
                {
                    X=97;
                }
                j+=1;
            }
            sb.append(X);
            }
        }
		bw.write("So, the Encrypted String is - "+sb);
		bw.flush();
	}
}




