public class Problem4 
{
    public static void main(String[] args) 
    {
    	int highestnum=0;
    	for(int num=2;num<15001;num++)
    	{
    		int i = 2;
            boolean flag = false;
            while(i <= num/2)
            {
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
                i++;
            }
            if (!flag)
                highestnum=num;
    	}
    	System.out.println(highestnum);
    }
}