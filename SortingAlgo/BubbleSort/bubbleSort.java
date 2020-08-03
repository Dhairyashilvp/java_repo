class bubbleSort{
    public static void bubblesort(int iparray[],int len)
    {
        boolean sorted = true;
        for(int i = 0; i < len-1; i++)
        {
            for(int j = 0; j < len-i-1; j++)
            {
                if(iparray[j] > iparray[j+1])
                {
                    int temp = iparray[j];
                    iparray[j] = iparray[j+1];
                    iparray[j+1] = temp;
                    sorted = false;
                }
            }
            if
        }
    }
    
    public static void main(String args[])
    {
        int iparray[] = { 64, 34, 25, 12, 22, 11, 90 };
        int len = iparray.length;
        bubblesort(iparray,len);
        for (int i=0; i<len; ++i) 
            System.out.print(iparray[i] + " "); 
        System.out.println();
    }
}