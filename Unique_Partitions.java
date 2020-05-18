import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void backtrack(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> current, int sum, int[] choices,int index)
    {
        if(sum==0)
        {
           list.add(new ArrayList<>(current));
           return;
        }
        if(sum<0)
        {
            return;
        }
        for(int i=0;i<choices.length;i++)
        {
            if(i<index-1)
            {
                continue;
            }
            
            current.add(choices[i]);
            backtrack(list,current,sum-choices[i],choices,i+1);
            current.remove(current.size()-1);
        }
    }
   
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    int n=sc.nextInt();
		    int choices[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        choices[i]=n-i;
		    }
		    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		    backtrack(list,new ArrayList<>(),n,choices,0);
		    
		    StringBuffer bf=new StringBuffer("");
		    for(int i=0;i<list.size();i++)
		    {
		        for(int j=0;j<list.get(i).size();j++)
		        {
		            bf.append(list.get(i).get(j)+" ");
		        }
		    }
		    System.out.println(bf.toString());
		}
	}