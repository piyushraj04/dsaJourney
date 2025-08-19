package Recursion;

public class ProductOfDigits {
    public static int productOfdigits(int n,int product)
    {
        if(n==0)
        {
            //product*=n;
            return product;
        }
        product*=(n%10);
        return productOfdigits(n/10,product);
    }
    public static void main(String[] args) {
        int n = 12346;
        System.out.println(productOfdigits(n,1));
    }
    
}
