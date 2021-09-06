public class Array {
    public static void main(String args[])
    {
        int a[] = {1, 4, 5, 7, 9 } , target = 8;
        System.out.println(Insert(a , target));
    }
    static int Insert(int[] a , int target)
    {
        int n = a.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] >= target)
                return i;
        }
        return n;
    }

}
