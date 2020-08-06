class QuickSort{
    public static int part(int[] iparray, int first, int last)
    {
        int pivot = iparray[last];
        int i = first - 1;
        for(int j = first; j < last; j++)
        {
            if(iparray[j] < pivot)
            {
                i++;
                int temp = iparray[i];
                iparray[i] = iparray[j];
                iparray[j] = temp;
            }
        }
        iparray[last] = iparray[i+1];
        iparray[i+1] = pivot;

        return i+1;
    }

    public static void QuickSort(int[] iparray, int first, int last)
    {
        if(first < last)
        {
            int pi = part(iparray, first, last);
            QuickSort(iparray, first, pi - 1);
            QuickSort(iparray, pi + 1, last);
        }
    }

    public static void main(String args[])
    {
        int iparray[] = {10, 7, 8, 9, 1, 5};
        int len = iparray.length;
        QuickSort(iparray, 0, len-1);
        for (int i=0; i<len; ++i) 
            System.out.print(iparray[i] + " "); 
        System.out.println();
    }

    public static void printar(int[] iparray)
    {
        int len = iparray.length;
        for(int i = 0; i < len; i++)
        {
            System.out.print(iparray[i] + " ");
        }
    }
}