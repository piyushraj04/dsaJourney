public class TernaryEx{
    public static void main(String [] args)
    {
        int  a = 5;
        int b = 8;
        int c = 12;
        System.out.println(a>b?a:b>c?b:c);
        System.out.println(a>b?"Piyush":b>c?"Raj":"Mayank");
    }
}