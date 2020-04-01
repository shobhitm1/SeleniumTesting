import java.util.ArrayList;

public class UniqueNumbers 
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int a[]= { 1,4,1,5,6,4,7,8,6};

	ArrayList<Integer> ab =new ArrayList<Integer>();
	for(int i=0;i<a.length;i++) 
	{
		if(!ab.contains(a[i]))
		{
		  ab.add(a[i]);
			int k=0;
		  k++;
		  for(int j=i+1;j<a.length;j++) 
		  {
		    if(a[i]==a[j]) 
		    {
			  k++;
		    }
			 
		    
		  }
		System.out.println("The value is "+ a[i]);
		System.out.println("Repated times is "+ k);
	
		}
	
	}

    }
}

