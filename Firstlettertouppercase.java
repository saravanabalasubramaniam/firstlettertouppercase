import java.util.*;
public class Firstlettertouppercase
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        char ch[]=str.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);
        for(int i=1;i<str.length();i++)
        {
            if(ch[i]==' ')
            {
                ch[i+1]= Character.toUpperCase(ch[i+1]);
            }
        }
        String str1=new String(ch);
        System.out.println(str1);
	}
}
