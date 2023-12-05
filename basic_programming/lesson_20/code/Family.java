package static_overload;

public class Family {
    public static int balance = 1000;
    public String name;
    public Family(String name){
        this.name = name;
    }

    public void income(int amount){
        if (checkAmount(amount)){
            Family.balance += amount;
        }else{
            System.out.println("Сумма должна быть положительной");
        }
    }

    public void outcome(int amount){
        if (checkAmount(amount)){
            if (Family.balance >= amount){
                Family.balance -= amount;
            }else{
                System.out.println("Денег не хватает");
            }
        }else{
            System.out.println("Сумма должна быть положительной");
        }

    }

    private boolean checkAmount(int sum){
        return sum > 0;
    }
}


// добавить приватный метод checkAmount
// который принимает сумму и проверяет ее
// если сумма больше нуля, то возвращает true
// в ином случае false

// используйте checkAmount в методах income и outcome
//  проверяя сумму перед добавлением или вычитанием

// если сумма указана неверно, то вывести
// сообщение в терминал "Сумма должна быть положительной"
