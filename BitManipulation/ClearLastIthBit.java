package BitManipulation;

public class ClearLastIthBit {
    public static int clearLastIthBit(int n,int i)
    {
        int maskBit = -1<<i;
        return n & maskBit;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15, 2));
    }
    
}
