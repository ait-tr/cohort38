public class Account {
    private int balance;
    private int number;
    public int[] depositAmounts;

    public Account(int balance, int number) {
        this.balance = balance;
        this.number = number;
        this.depositAmounts = new int[0];
    }

    private void addAmount(int amount){
        int[] newArr = new int[this.depositAmounts.length + 1];
        for (int i = 0; i < this.depositAmounts.length; i++) {
            newArr[i] = this.depositAmounts[i];
        }
        newArr[newArr.length - 1] = amount;
        this.depositAmounts = newArr;
    }

    public void debit(int amount){
        this.balance += amount;
        addAmount(amount);
    }
    public void clearHist(){
        this.depositAmounts = new int[0];
    }

    public int getMaxDeposit(){
        if (this.depositAmounts.length == 0){
            return -1;
        }
        int result = this.depositAmounts[0];
        for (int elem : this.depositAmounts) {
            result = elem > result ? elem : result;
        }
        return result;
    }

    public int getMinDeposit(){
        if (this.depositAmounts.length == 0){
            return -1;
        }
        int result = this.depositAmounts[0];
        for (int elem : this.depositAmounts) {
            result = elem < result ? elem : result;
        }
        return result;
    }

    public void withdraw(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        }else{
            System.out.println("Денег на счету недостаточно");
        }
    }
}
