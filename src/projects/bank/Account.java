package projects.bank;

public class Account {

    private final String accountID;
    private final String ownerName;
    private double accountBalance;
    private final AccountType accountType;

    public Account(
        String id,
        String name,
        double balance,
        AccountType type
    ) {
        // TODO: Validate that String parameters are not null
        accountID = id;
        ownerName = name;
        accountBalance = balance;
        accountType = type;
    }

    public String getID() { return accountID; }

    // stripped-down version of `equals` override
    // give it a similar sounding name 
    public boolean sameAs(Account other) {
        return this.getID().equals(other.getID());
    }

}
