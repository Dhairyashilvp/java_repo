import java.util.*;

class bytelandian_gold_coins
{
    static HashMap<Integer,Long>c=new HashMap<>();
    public static long process(int n) 
    {
        if(n==0)
        {
            return n;
        }
        if(c.containsKey(n))
        {
            return c.get(n);
        }
        else
        {
            long ans = Math.max(n, process(n/2) + process(n/3) + process(n/4));
            c.put(n, ans);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type input");
        while(sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(process(n));
		}
        sc.close();        
    }
}