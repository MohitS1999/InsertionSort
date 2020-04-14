import java.util.*;
public class InsertionSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		insertion(a,n);
	}
	public static void insertion(int a[],int n){
		for(int i=0;i<n;i++){
			int j=i-1;
			int x=a[i];
			while(j>-1&&a[j]>x){
				a[j+1]=a[j];
				j--;
			}a[j+1]=x;
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}