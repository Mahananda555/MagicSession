/* Program 1  : Write a  Java Program to create a 3D Jagged array, by taking all parameters like, plane, columns and rows
 from user. And print the 3D array.
*/

import java.io.*;
class JaggedArray{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter the number of plane");
		int p=Integer.parseInt(br.readLine());
		System.out.println("enter the row");
		int row=Integer.parseInt(br.readLine());

		int[][][] arr=new int[p][row][];

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter the column size of " +i+ " plane and "+j+" row ");
				int n=Integer.parseInt(br.readLine());
				arr[i][j]=new int[n];
			}
		}

		System.out.println("Enter the array element: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					arr[i][j][k]=Integer.parseInt(br.readLine());
				}
			}
		}

		System.out.println("Jagged array : ");
	
		for(int i=0;i<arr.length;i++){
			System.out.println((i+1)+" plane element");
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
	
		}

		
	}
}
