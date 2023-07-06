import java.util.Scanner;
class BankAccount{

    String Name;
    String Password;
    String UserName;
    String AccountNo;
    float Balance=100000f;
    int Transactions=0;
    String TransactionHistory="";

    public void Register(){

        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n ENTER YOUR NAME: ");
        this.Name=sc.nextLine();

        System.out.println("\n\n ENTER YOUR PASSWORD:  ");
        this.Password=sc.nextLine();

        System.out.println("\n\n ENTER YOUR USER NAME: ");
        this.UserName=sc.nextLine();

        System.out.println("\n\n ENTER YOUR ACCOUNT NUMBER: ");
        this.AccountNo=sc.nextLine();

        System.out.println("\n\n REGISTRATION COMPLETED ...... KINDLY LOGIN: ");
    }
    public boolean Login(){
        boolean isLogin = false;
        Scanner sc=new Scanner(System.in);
        while (!isLogin){
            System.out.println("\n ENTER YOUR USERNAME: ");
            String Username=sc.nextLine();
            if(Username.equals( UserName )){

                while(isLogin){
                    System.out.println(" \n ENTER YOUR PASSWORD: ");
                    String password=sc.nextLine();
                    if(password.equals( Password )){
                        System.out.println(" \n LOGIN SUCCESSFUL !!!!!!!!!!!!");
                        isLogin=true;
                    }
                   else {
                        System.out.println("\n SORRY, YOU ENTERED INCORRECT PASSWORD !!!!!");
                    }
                }
            }
          else{
                System.out.println("\n USERNAME NOT FOUND!!!!!!!!");
          }
        }
      return isLogin;
    }

    public void Withdraw(){

        System.out.println("\n ENTER AMOUNT TO WITHDRAW:  ");
        Scanner sc=new Scanner(System.in);
        float Amount = sc.nextFloat();
        try {
            if (Balance >= Amount) {
                Transactions++;
                Balance -= Amount;
                System.out.println("\n CONGRATS!!!! SUCESSFULLY WITHDRAW>>>>>>.");
                String str = Amount + "WITHDRAW MONEY \n";
                TransactionHistory = TransactionHistory.concat(str);
            }
           else{
                System.out.println("\n YOUR BALANCE INSUFFICIENT!!!!!!!");
            }
        }
        catch(Exception e){

        }
    }

   public void Deposit(){

       System.out.println("\n ENTER YOUT AMOUNT TO DEPOSIT:  ");
       Scanner sc=new Scanner(System.in);
       float Amount=sc.nextFloat();
       try {
           if(Amount <=100000f){
               Transactions++;
               Balance +=Amount;
               System.out.println("\n DEPOSITION SUCCESSFUL  !!!");
               String str=Amount +"DEPOSITED MONEY \n";
               TransactionHistory = TransactionHistory.concat(str);
           }
           else{
               System.out.println("\n SORRY :(   LIMIT IS 100000.00 ");
           }
       }
       catch(Exception e){

       }
   }

   public void Transfer(){
  Scanner sc=new Scanner(System.in);
       System.out.println("\n ENTER RECEIPENT'S NAME: ");
        String Receipent=sc.nextLine();
       System.out.println("\n ENTER THE AMOUNT YOU WANT TO TRANSFER: ");
        float Amount=sc.nextFloat();
        try{
            if(Balance >= Amount){
             if(Amount <= 50000f){

                 Transactions++;
                 Balance -=Amount;
                 System.out.println("\n AMOUNT SUCCESSFULLY TRANSFERED TO" +Receipent);
             String str=Amount+"MONEY TRANSFERED TO "+ Receipent+"\n";
                 TransactionHistory = TransactionHistory.concat(str);
             }
           else{
                  System.out.println("\n SORRY :(    , LIMIT IS 50000.00 ");
           }
            }
            else{
                System.out.println("\n BALANCE IS INSUFFICIENT");
            }
        }
        catch(Exception e){
        }
    }

  public void ChechBalance(){
      System.out.println("\n"+ Balance + "RS");
    }
    public void TranseHistory(){
       if(Transactions==0){
           System.out.println("/n EMPTY :(   ");
       }
       else{
           System.out.println("\n"+ TransactionHistory);
       }
    }
}
public class AtmInterface {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}