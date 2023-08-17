package CC_Bank;

public abstract class CurrentAccount implements BankAccount
{
    @Override
    public void create_account()
    {
        System.out.println("A current-Account have been created!");
        System.out.println("The deposited amount is 45,000");
    }

    @Override
    public void interst_rate()
    {
        double SI,p,n,r;
        r=7;// The rate of interest for Savings Account is 7%.
        n=2;// The number of years for the savings is 2 years.
        p=45000;// The princple amount deposited is 45,000.
        SI=(p*n*r)/100;
        System.out.println("The Simple interst for the Current Account is :"+SI);
    }
}
