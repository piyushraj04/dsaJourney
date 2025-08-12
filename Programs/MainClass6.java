class Email
{
    String from ;
    String to;

    void sendMail()
    {
        System.out.println("Mail successfully sent to :" + to);
    }

    void receiveMail()
    {
        System.out.println("Receiving mail from :"+from + " to " + to);
    }
}

public class MainClass6 {
    public static void main(String[] args) {
        Email e1 = new Email();
        e1.to = "pavan@abcd.com";
        e1.from = "keshava@abcd.com";

        e1.sendMail();

        System.out.println("------------>");

        Email e2 = new Email();
        e2.from = "ravi@abcd.com";
        e2.to = "krishna@abcd.com";
        e2.receiveMail();
    }
}
