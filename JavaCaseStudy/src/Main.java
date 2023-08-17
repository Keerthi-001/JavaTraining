import CC_Bank.aaSA;
import CC_Bank.bbCA;
import CC_Bank.ccLA;


public class Main {
    public static void main(String[] args)
    {
        aaSA a1 = new aaSA();
        a1.create_account();
        a1.interst_rate();
        System.out.println();

        bbCA b1 = new bbCA();
        b1.create_account();
        b1.interst_rate();
        System.out.println();

        ccLA c1 = new ccLA();
        c1.create_account();
        c1.interst_rate();
    }
}