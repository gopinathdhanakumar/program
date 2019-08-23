import java.util.*;
public class Main
{
    public static HashMap<Character,Integer> alpha=new HashMap();
    
    public static void increment(char a)
    {
		alpha.put(a, alpha.get(a) + 1);
	}
	public static void main(String[] args) {
	    for(int i=0;i<26;i++)
        {
          char a=(char)(97+i);
          alpha.put(a,0);
        }
	    int total=0;
	    Scanner s=new Scanner(System.in);
	    String result[]={"Friendship","Love","Affection","Marriage","Enemy","Sister"};
	    System.out.println("Enter the 1st person name");
	    String person1=s.next();
		System.out.println("Enter the 2st person name");
		String person2=s.next();
		person1=person1.toLowerCase();
		person2=person2.toLowerCase();
		for(int i=0;i<person1.length();i++)
		{
		    increment(person1.charAt(i));
		}
		for(int j=0;j<person2.length();j++)
		{
		     increment(person2.charAt(j));
		}
		for(int i=0;i<26;i++)
        {
          char a=(char)(97+i);
          if(((alpha.get(a))%2)!=0)
          {
           total+=1;   
          }
        }
        String f="flames";
         System.out.println(total);
        while(f.length()>)
        {
            f=f.substring(total%f.length())+f.substring(total%f.length(),f.length());
            System.out.println(f);
        }
        System.out.println(f);
        
	}
}
