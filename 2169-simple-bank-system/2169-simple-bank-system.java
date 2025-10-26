class Bank {

    long bank[];

    public Bank(long[] balance) {
        bank = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 < 0 || account1 > bank.length || account2 < 0 || account2 > bank.length
                || bank[account1 - 1] < money)
            return false;

        bank[account1 - 1] -= money;
        bank[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account < 0 || account > bank.length)
            return false;
        bank[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account < 0 || account > bank.length || bank[account - 1] < money)
            return false;
        bank[account - 1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */