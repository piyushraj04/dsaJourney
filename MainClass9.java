class Login
{
    String userName;
    String psw ;

    void login()
    {
        System.out.println("Login Successfully with user : " + userName);
    }
    void forgotPassword()
    {
        System.out.println(psw + " is incorrect, Please try again or forgot password");
    }
}

public class MainClass9 {
    public static void main(String[] args) {
        Login u1 = new Login();
        u1.userName = "Piyush Raj";
        u1.psw = "5956265huhusd";
        u1.login();

        Login u2 = new Login();
        u2.userName = "Gagan Kr Singh";
        u2.psw  = "64f5f444dfe0";
        u2.forgotPassword();
    }
}
