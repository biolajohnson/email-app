package com.bankApplications.collectionsPractice;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private int mailBoxCapacity = 500;
    private String alternativeEmail;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "ekondo.com";

    //constructor to receive the first name and last name
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        //call a method asking for the departments
        this.department = setDepartment();
        // call method that generates password
        System.out.println("Your auto generated password is "+ setRandomPassword(10));

        email = firstname + "." + lastname + "-" + department + "@" + companySuffix;

    }
    //ask for the departments
    private String setDepartment(){
        System.out.print("Department codes \n1 Sales \n2 Development \n3 Accounting \n0 None \nEnter code: ");
        Scanner in = new Scanner(System.in);
        int dept = in.nextInt();
        switch (dept){
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "None";
        }
    }
    //generate a random password
    private String setRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!$@$%&";
        char[] password =  new char[length];
        for(int i = 0; i < length; i++){
          int rand = (int) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){ this.mailBoxCapacity = capacity; }
    //set the alternate email
    public void setAlternativeEmail(String altEmail){ this.alternativeEmail = altEmail;}
    //change the password
    public void setPassword(String password){this.password = password;}

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String showInfo(){
        return "Display name: " + firstname + " " + lastname +
                "\nEmail: " + email +
                "\nMailBox Capacity: " + getMailBoxCapacity() + "mb";
    }
}
