package BitManipulation;

public class GetIthBit {
    public static int getIthBit(int n,int i)
    {
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n = 12;
        int i = 2;
        System.out.println("The "+i+"nd bit in the number '"+n+"' is : "+getIthBit(n, i));

    }
    
}
