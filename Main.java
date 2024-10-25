import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
        System.out.println("enter the First name");
        String Firstname = in.next();
        System.out.println("enter the Last name");
         String Lastname = in.next();
        Email emp = new Email(Firstname, Lastname);
  }
}



class Email{
    private String Firstname;
    private String Lastname;
    private String password;
    private String department;
    private int mailboxcapacity=500;
    private String alternateemail;
    private String email;
    private int defaultpasswordlength = 8;
    private String Companyname = "XYZTech";

    public Email(String Firstname,String Lastname){
        this.Firstname =Firstname;
        this.Lastname = Lastname;
        System.out.println("welcome to our company"+this.Firstname+""+this.Lastname);
        this.department = setDepartment();
        this.password = randompassword(defaultpasswordlength);
        System.out.println("your password is "+this.password);
        email = this.Firstname.toLowerCase()+"."+this.Lastname.toLowerCase()+"@"+this.department+"."+this.Companyname+".com";
        System.out.println("Your Emailid is "+email);
      System.out.println("Your Email capacity is "+mailboxcapacity+"MB");
    }

    private String setDepartment(){
        System.out.println("Enter the department code \n1 for sales\n2 for Development\n3 for Testing\n4 for accounting\n0 for none");


        Scanner in = new Scanner(System.in);
        int depchoice = in.nextInt();
        if(depchoice==1){return "sal";}
        else if(depchoice==2){return "Dev";}
        else if(depchoice==3){return "Test";}
        else if(depchoice==4){return "acc";}
        else {return " ";}
    }

    private String randompassword(int length){
        String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
          int rand =   (int) (Math.random()*passwordset.length());
          password[i] = passwordset.charAt(rand);
        }

        return new String(password);
    }
}
