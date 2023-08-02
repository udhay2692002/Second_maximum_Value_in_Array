class q3
{
    public static void main(String []args)
    {
        char arr[]={2,3,1,4,8,10,6,9,7,5};
        int len=arr.length;
        int max=0;
        int min=0;
        //LOGIC

        for(int i=0;i<=len;i++)
        {
            if(max>=min)
            {
                min = max;
                max = i;

            }
        }
        System.out.println("SECOND MAXIMUM IN THE ARRY IS "+min);
    }
}
