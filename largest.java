public class largest {
    public static void main(String[] args) {
        int a[] = {2,4,7,9,2};
        int largest = a[0];
        for(int i = 1;i<a.length;i++)
        {
            if(a[i] > largest)
            {
                largest = a[i];
            }
        }
        System.out.println("largest number " +largest);
    }
}
