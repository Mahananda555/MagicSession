/* Program 2a : Write a program to print fibonacci series upto the n (User Input). */

import java.io.*;
class fibonacci{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enetr the number");
		int n=Integer.parseInt(br.readLine());
		int a=0;
		int b=0;
		int c=1;
		for(int i=0;i<=n;i++){
			System.out.print(b+",");
			a = b + c;
            		b = c;
            		c = a;
		}
	}
}