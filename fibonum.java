/*Program 2b : Write a program to print n (User Input) elements of fibonacci series. */

import java.io.*;
class fibonum{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enetr the number");
		int n=Integer.parseInt(br.readLine());
		int c=0;
		int a=0;
		int b=1;
		for(int i=0;i<=n;i++){
			if(a<=n){
				System.out.print(a+",");
			
				c = a + b;
            			a = b;
            			b = c;
			}
		}
	}
}