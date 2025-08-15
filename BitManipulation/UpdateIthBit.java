package BitManipulation;

public class UpdateIthBit {

    public static int clearIthBit(int n, int i) {
        int maskBit = ~(1 << i);
        return n & maskBit;
    }

    public static int setIthBit(int n,int i)
    {
        int maskBit = 1<<i;
        return n | maskBit;
    }

    public static int updateIthBit(int n,int i,int newBit){
        if(newBit == 0)
        {
            return clearIthBit(n, i);
        }
        else
        {
            return setIthBit(n, i);
        }
    }

    public static int updateIthBit2ndApp(int n,int i,int newBit)
    {
        n = clearIthBit(n, i);
        int maskBit = newBit<<i;
        return n | maskBit;
    }
  
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 0));
        System.out.println("------------------");
        System.out.println(updateIthBit2ndApp(10, 2, 1));


    }
}
