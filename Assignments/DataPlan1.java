import java.util.Scanner;
public class Seriously 
{
	
	public static void main (String[] args) throws Exception
	{

	Scanner in=new Scanner(System.in);
        System.out.println("Enter the talk minutes");
        int talkmin=in.nextInt();
        
        System.out.println("Enter the text messages");
        int textmsg=in.nextInt();
       
        System.out.println("Enter the gigabyte Data");
        int gbdata=in.nextInt();
        
        if(talkmin < 500 && textmsg == 0 && gbdata == 0)
       
        	System.out.println("Plan A  $49 per month");
        	else if(talkmin < 500 && textmsg > 0 && gbdata == 0)
        	{
             System.out.println("Plan B  $55 per month");
        	}
        	else if(talkmin >= 500 && textmsg < 100 && gbdata == 0)
        	{
             System.out.println("Plan C  $70 per month");
        	}
        	else if(talkmin >= 500 && textmsg >= 100 && gbdata == 0)
        	{
             System.out.println("Plan D  $87 per month");
        	}
        	else if(gbdata > 0 && gbdata < 3)
        	{
             System.out.println("Plan E  $79 per month");
        	}
        	else if(gbdata >= 3)
        	{
             System.out.println("Plan F  $87 per month");
        }	
		in.close();
	}
}
