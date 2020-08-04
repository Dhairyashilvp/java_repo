class InsertionSort{
    public static void insertionsort(int[] iparray, int len)
    {
        for(int i = 1; i < len; ++i)
        {
            int key = iparray[i];
            int j = i - 1;
            while(j >= 0 && iparray[j] > key )
            {
                iparray[j+1] = iparray[j];
                j = j - 1;
            }
            iparray[j + 1] = key; 
        }
    }

    public static void printarr(int[] iparray)
    {
        int len = iparray.length;
        for (int i=0; i<len; ++i) 
            System.out.print(iparray[i] + " ");
    }

    public static void main(String args[])
    {
        // int iparray[] = { 64, 34, 25, 12, 22, 11, 90 };
        // int iparray[] = { 64, 24, 25, 18 };
        int iparray[] = { 99, 98, 97, 96 };
        int len = iparray.length;
        insertionsort(iparray,len);
        for (int i=0; i<len; ++i) 
            System.out.print(iparray[i] + " "); 
        System.out.println();
    }
}