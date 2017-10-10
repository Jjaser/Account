
class Account
{
    protected String name;
    protected double balance;
    protected double rate;

    public Account()
    {
        this.name = "";
        this.balance = 0;
        setRate();
    }

    public Account(String name)
    {
        this.name = name;
        this.balance = 0;
        setRate();
    }

    public Account(String name, double value)
    {
        this.name = name;
        this.balance = value;
        setRate();
    }

    public Account(Account x)
    {
        this.name = x.name;
        this.balance = x.balance;
        setRate();
    }

    public void setRate()
    {
        rate = 2;
    }

    public void setRate(double value)
    {
        rate = value;
    }

    public String getName()
    {
        return name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBalance(double value)
    {
        this.balance = value;
    }

    public boolean put(double value)
    {
        if (value > 0)
        {
            this.balance += value;
            return true;
        }
        return false;
    }

    public double get(double value)
    {
        if (value > 0)
        {
            if (value <= this.balance)
                this.balance -= value;
            else
            {
                value = this.balance;
                this.balance = 0;
            }
            return value;
        }
        return 0;
    }

    public double nextYear()
    {
        this.balance *= (1 + rate);
        return this.balance;
    }
}

class Account_white extends Account
{
    public Account_white()
    {
        super();
        setRate();
    }

    public Account_white(String name)
    {
        super(name);
        setRate();
    }

    public Account_white(String name, double value)
    {
        super(name, value);
        setRate();
    }

    public Account_white(Account_white x)
    {
        this.name = x.name;
        this.balance = x.balance;
        setRate();
    }

    public Account_white(Account x)
    {
        this.name = x.name;
        this.balance = x.balance;
        setRate();
    }

    @Override
    public void setRate()
    {
        super.setRate(3);
    }
}

class Account_black extends Account
{
    public Account_black()
    {
        super();
        setRate();
    }

    public Account_black(String name)
    {
        super(name);
        setRate();
    }

    public Account_black(String name, double value)
    {
        super(name, value);
        setRate();
    }

    public Account_black(Account_black x)
    {
        this.name = x.name;
        this.balance = x.balance;
        setRate();
    }

    public Account_black(Account x)
    {
        this.name = x.name;
        this.balance = x.balance;
        setRate();
    }

    @Override
    public void setRate()
    {
        super.setRate(1);
    }
}

public class Account_test
{
    public static void main(String[] args)
    {
        Account a = new Account("1", 1);
        Account_white b = new Account_white(a);
        Account_black c = new Account_black(b);
        return;


    }
}