class SelectionSort{
    public static void SelectionSort(int[] iparray, int len)
    {
        for(int i = 0; i < len-1; i++)
        {
            int min = i;
            for(int j = i+1; j < len; j++)
            {
                if(iparray[j] < iparray[min])
                {
                    min = j;
                }
            }
            int temp = iparray[min];
            iparray[min] = iparray[i];
            iparray[i] = temp;
        }
    }
    public static void main(String args[])
    {
        int iparray[] = { 64, 34, 25, 12, 22, 11, 90 };
        int len = iparray.length;
        SelectionSort(iparray,len);
        for (int i=0; i<len; ++i) 
            System.out.print(iparray[i] + " "); 
        System.out.println();
    }
}