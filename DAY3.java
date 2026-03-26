class Bank{
    void account()
{
    System.out.println("account holder joy");
}
    void accountstatus()
{
    System.out.println("aadhaar and kRC attached");
} 
}
class joooi extends Bank{
    void blanky()
    {
    System.out.println("not attached");
}}
public class DAY3 {
    public static void main(String[] args)
    { 
        Bank bnk =new joooi();
        bnk.account();
        bnk.accountstatus();
    }
}