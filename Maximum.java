import java.util.*;
public class Maximum
{
	public static void main(String[] args) {
	    int []a =new int[5];
	   int m=a[0];
	    Scanner sc=new Scanner (System.in);
	    for (int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	   
	    for(int i=0;i<a.length;i++){
	        if(m<a[i])
	         {
	             m=a[i];
	         }
	         
	    }