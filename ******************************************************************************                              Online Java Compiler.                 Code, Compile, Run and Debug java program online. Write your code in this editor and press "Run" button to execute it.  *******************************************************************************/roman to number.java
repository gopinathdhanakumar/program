//please save the program as Main.java
import java.util.*;
public class Main
{ 
    public static int value(char r)
    {
    if (r == 'I') 
        return 1; 
    if (r == 'V') 
        return 5; 
    if (r == 'X') 
        return 10; 
    if (r == 'L') 
        return 50; 
    if (r == 'C') 
        return 100; 
    if (r == 'D') 
        return 500; 
    if (r == 'M') 
        return 1000; 
  
    return 0; 
        
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String roman=s.next();
	    int res=0,r1,r2;
	    for(int i=0;i<roman.length()-1;i=i+2)
	    {
	        r1=value(roman.charAt(i));
	        r2=value(roman.charAt(i+1));
	        if(r2>r1)
	        {
	            res=res+r2-r1;
	        }
	        else
	        {
	            res=res+r1+r2;
	       }
	        
	    }
		System.out.println(res);
	}
}
