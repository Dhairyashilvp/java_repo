class MergeSort{
    public static void Merging(int[] iparray, int left, int mid, int right)
    {
        //printarr(iparray);
        // System.out.println("left:"+left+"::mid:"+mid+"::right"+right);
        int n1 = mid + 1 - left;
        int n2 = right - mid;

        int[] L= new int[n1];
        int[] R= new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = iparray[left + i];
        for(int i = 0; i < n2; i++)
            R[i] = iparray[mid + 1 + i];
        // printarr(L);
        // printarr(R);
        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                iparray[k] = L[i];
                i++;
            }else{
                iparray[k] = R[j];
                j++;   
            }
            k++;
        }
        while(i < n1)
        {
            iparray[k] = L[i];
            k++;
            i++;
        }
        while(j < n2)
        {
            iparray[k] = R[j];
            k++;
            j++;
        }

    }
    public static void MergeSort(int[] iparray, int left,int right)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            // System.out.println("l:"+left+"::r:"+right+"::m:"+mid);
            MergeSort(iparray, left, mid);
            MergeSort(iparray, mid + 1, right);
            Merging(iparray, left, mid, right);
        }
    }
    public static void main(String arge[])
    {
        int iparray[] = {10, 7, 8, 9, 1, 5};
        MergeSort(iparray, 0, iparray.length-1);
        for (int i=0; i<iparray.length; ++i) 
            System.out.print(iparray[i] + " "); 
        System.out.println();
    }

    public static void printarr(int[] iparray)
    {
        int len = iparray.length;
        for(int i = 0; i < len; i++)
            System.out.print(iparray[i]+" ");
        System.out.println();
    }
}