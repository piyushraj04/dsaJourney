package BitManipulation;

public class ClearIthTerm {
    public static int clearIthTerm(int n,int i)
    {
        int maskBit = ~(1<<i);
        return n&maskBit;
    }
    public static void main(String[] args) {
        System.out.println(clearIthTerm(10, 1));
        
    }
    
}
