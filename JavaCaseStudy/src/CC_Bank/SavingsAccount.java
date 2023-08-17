package CC_Bank;

public abstract class SavingsAccount implements BankAccount
{
    @Override
    public void create_account()
    {
        System.out.println("A Savings-Account have been created!");
        System.out.println("The deposited amount is 45,000");
    }

    @Override
    public void interst_rate()
    {
        double SI,p,n,r;
        r=6;// The rate of interest for Savings Account is 6%.
        n=2;// The number of years for the savings is 2 years.
        p=45000;// The principle amount deposited is 45,000.
        SI=(p*n*r)/100;
        System.out.println("The Simple interst for the Savings Account is :"+SI);
    }
}
