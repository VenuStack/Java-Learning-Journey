class FizzBuzz
{
    public static void main(String [] args)
    {
        int num=15;
        String res=(num%3==0 && num%5==0)?"FizzBuzz" : "Not FizzBuzz";
        System.out.println(res);
    }
}