//>>>>>BY<<<<<<<
//Name : rohith_Sivapuram
//A simple banking system using menu driven method
//level :BEGINNER
import java.util.Scanner;

public class Main {
    int bal,previous_trans;
    String cust_name;
    String cust_id ;
    String cname,cid;

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        BankAccount obj1 = new BankAccount("ram","BA00123");
        obj1.Showmenu();
    }
    static class BankAccount{
        int bal,previous_trans;
        String cust_name;
        String cust_id ;
        BankAccount(String cname,String cid) {
            this.cust_name = cname;
            this.cust_id = cid;
        }
        void deposite(int amount){
            if(amount!=0){
                bal=bal+amount;
                previous_trans=amount;
            }
        }
        void withdraw(int amount){
        if(amount!=0){
          bal=bal-amount;
          previous_trans=-amount; }
        }
        void getprevious_trans(){
            if(previous_trans>0){
                System.out.println("Deposited amount :"+previous_trans);
            }
            else if (previous_trans<0){
                System.out.println("Withdraw :"+Math.abs(previous_trans));
            }
            else {
                System.out.println("No transaction occured ");
            }

        }
        void Showmenu(){
            char option='\0';
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome "+cust_name);
            System.out.println("Id :"+cust_id);
            System.out.println("\n");
            System.out.println("A.**checkbalance**");
            System.out.println("B.**Deposite**");
            System.out.println("C.**withdraw**");
            System.out.println("D.**previoustransaction**");
            System.out.println("E.*->Exit<-*");
            do{
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("Enter an option");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                option=sc.next().charAt(0);
                System.out.println("\n");
                switch (option){
                    case 'A':
                    case 'a':
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("Your Balance :"+bal);
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        break;

                    case 'B':
                    case 'b':
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("Kindly enter the amount to deposite");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        int amount = sc.nextInt();
                        deposite(amount);
                        System.out.println("\n");
                        break;

                    case 'c':
                    case 'C':
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("Kindly enter an amount to withdraw");
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        int amount2=sc.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;
                    case 'D':
                    case 'd':
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        getprevious_trans();
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        System.out.println("\n");
                        break;
                    case 'E':
                    case 'e':
                        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                        break;
                        default:
                        System.out.println("invalid entry of option please enter appropriate option ");
                        break;
                }
            }
            while (option!='E'& option!='e');
            System.out.println("Thankyou for using our services");
            System.out.println("*******HAVE A NICE DAY*******");


            }
        }
}
