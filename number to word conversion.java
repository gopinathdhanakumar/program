import java.util.*;
public class Main
{
    static public String  conversion(int n)
    {
        String []one={"Zero ", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
			String []two={"", "","Twenty", "Thirty", "Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			
			if (n<0)
			{
			    return "minus"+" "+conversion(-n);
			}
			if(n<20)
			{
			    return one[n];
			}
			if(n<100)
			{
			    return two[n/10]+ ((n%10 ==0)?" ":" "+conversion(n%10));
			}
			if(n<1000)
			{
			    return one[n/100]+" hundred " +((n%100 ==0)?" ":" "+conversion(n%100));
			}
			if(n<100000)
			{
			    return conversion(n/1000)+" Thousand " +((n%10000 ==0)?" ":" "+conversion(n%1000));
			}
				
			if(n<10000000)
			{
			    return conversion(n/100000)+" lakhs" +((n%100000 ==0)?" ":" "+conversion(n%100000));
			}
			
				if(n<1000000000)
			{
			    return conversion(n/10000000)+"crores " +((n%10000000 ==0)?" ":" "+conversion(n%10000000));
			}
			else
			{
			 System.out.println("high value to calculate !sorry");   
			}
			return "";
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(conversion(n));
		
	}
}
