class Sample{
    static int x = 25;
    static double y = 4.5;
    static void help()
    {
        System.out.println("Executing help().......");
    }
    static void send()
    {
        System.out.println("Executing send().......");
    }
}
public class MainClass2 {
    public static void main(String[] args) {
        System.out.println(Sample.X);
        System.out.println(Sample.y);
        Sample.help();
        Sample.send();
        
    }
}
