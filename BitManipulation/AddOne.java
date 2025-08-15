package BitManipulation;

public class AddOne {
    public static int addOne(int n)
    {
        int maskBit = (1<<1)-1;
        return n | maskBit;
    }
    public static void main(String[] args) {
        System.out.println(addOne(10));
        
    }
    
}
