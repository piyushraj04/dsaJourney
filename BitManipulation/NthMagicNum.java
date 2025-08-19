package BitManipulation;

public class NthMagicNum {
    static int power(int base,int ex)
    {
        int pow = 1;
        for(int i = 1; i <= ex; i++)
        {
            pow = pow*base;
        }
        return pow;
    }
    public static void main(String[] args) {
        int n = 4;
        int magic = 0;
        int i = 1;
        while(n!=0)
        {
            int ld = n&1;
            magic = magic + ld * power(5, i);
            i++;
            n = n>>1;
        }
        System.out.println(magic);
    }
    
}
