package inheritance_2;

public class Client extends Person{
    public String loyaltyProgram;
    public Client(String firstName, String lastName, String loyaltyProgram){
        super(firstName, lastName);
        this.loyaltyProgram = loyaltyProgram;
    }

    @Override
    public String info(){
        return String.format("%s (%s)%n", super.info(), this.loyaltyProgram);
    }
    @Override
    public void greeting(){
        if (this.loyaltyProgram.equals("Gold")){
            super.greeting();
        }else{
            System.out.printf("Привет, %s%n",  this.info());
        }
    }
}

// переписать метод greeting таким образом, чтобы он в случае, если
// loyaltyProgram = "Gold" выводил Здравствуйте, <имя и фамилия клиента>
// loyaltyProgram != "Gold" выводил Привет, <имя и фамилия клиента>