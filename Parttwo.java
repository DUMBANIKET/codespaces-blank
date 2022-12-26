import java.lang.Math;
import java.util.Scanner;
class Parttwo {
    public long c_no;
    public String c_name;
    public String c_add;
    public long nou;
    public double cal;
        

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Parttwo b=new Parttwo();
        while (true) {
            int ch;
            System.out.println("enter your choices \n 1:login \n 2:view bill \n 3:exit");
            ch=in.nextInt();

            switch (ch) {
                case 1:
                    b.calculate();
                    b.electric_bill();
                    b.display();
                    
                    break;
                case 2:
                    b.display();    
                    
                    break;

                case 3:
                    System.exit(0);
                    
                    break;
                default:
                    System.out.println("bruh add something proper");
                    break;
            }

        }

    }

    public double electric_bill(){
        
       
        if(nou<=100){
            cal=500;
        }
        else if(nou <=200 && nou >=101){
            cal=1*nou+500;
        }

        else if(nou <=300 && nou >=201){
            cal=1.20*nou+500;
        }

        else{
            cal=1.50*nou+500;
        }
        return cal;

    }

    public void display(){

        System.out.println("Your Bill \n\n Client Number : " + c_no +"\n\n Client ka naam : "+ c_name +"\n\n Client Address : "+c_add+"\n\n Total Price For electricity: $ "+cal);
    }

    public void calculate(){
        Scanner input=new Scanner(System.in);
        int min = 0;  
        int max = 1100;  
        System.out.println("Enter your detail\'s");
        c_no=(long)Math.random()*(max-min+1)+min; 
        System.out.println("Enter your name");
        c_name=input.nextLine();
        System.out.println("Enter your address");
        c_add=input.nextLine();
        System.out.println("Enter your Number Of Unit\'s");
        nou=input.nextLong();
    }

}