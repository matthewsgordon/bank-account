/**
* BankAccount class 
*
* @pauthor  Matthew Gordon
*
*/
public class BankAccount {
    private float balance;      // balance of account
	private int accountNumber;  // account number (6 digits)
	private String sortcode;    // sortcode (format nn-nn-nn)

    /**
    * Constructor
    *
    * Initialises BankAccount and variables.
    *
    */
    public BankAccount()
    {
        balance = 0.0f;
        accountNumber = 0;
        sortcode = "";
    }

    /**
    * Deposits amount in account 
    * 
    * @param amount Amount to increase the account balance by 
    *
    */
    public void deposit(float amount)
    {
        balance = balance + amount;
    }

    /**
    * Withdraws amount from account 
    *
    * @param amount Amount to withdraw
    *
    */
    public void withdraw(float amount)
    {
        // Ensure that funds are available to withdraw 
        if (amount <= balance)
        {
            balance = balance - amount;
        }     
    }

    /**
    * Summarises the account status 
    *
    * @return Summary of account status 
    *
    */
    public String summarise()
    {
        return "Acc. Num: " 
            + accountNumber 
            + " Sort: " 
            + sortcode 
            + " Balance: $" 
            + balance;            
    }

    /**
    * Sets balance of account
    *
    * @param b Balance value 
    * 
    */
    public void setBalance(float b) 
    {
        balance = b;
    }

    /**
    * Sets the account number 
    *
    * @param n Account number
    * 
    */
    public void setAccountNumber(int n)
    {   
        // Checks the account number is 6 digits
        if (n <= 999999 && n >= 100000)
        {
            accountNumber = n;
        }        
    }

    /**
    * Sets the Sortcode 
    *
    * @param s Sortcode (format nn-nn-nn)
    * 
    */
    public void setSortcode(String s)
    {
        sortcode = s;
    }

    /**
    * Gets the balance of the account
    *  
    * @return   Balance of the account
    *
    */
    public float getBalance()
    {
        return balance;
    }

    /**
    * Returns the account number
    * 
    * @return  account number
    *
    */
    public int getAccountNumber()
    {
        return accountNumber;
    }

    /**
    * Returns the sortcode
    * 
    * @return sortcode
    *
    */
    public String getSortcode()
    {
        return sortcode;
    }
}