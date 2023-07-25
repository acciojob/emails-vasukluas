package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(oldPassword.equals(password)){
            if(isValid(newPassword)){
                System.out.println("Password changed successfully");
                this.password=newPassword;
            }

                System.out.println("The new password is not valid");

        }
        else{
            System.out.println("The given password doesn't match the current password");
        }
    }
    public boolean isValid(String newPassword){
        boolean capital=false;
        boolean small=false;
        boolean digit=false;
        boolean special=false;
        if(newPassword.length()<8){
            return false;
        }
        for(int i=0;i<newPassword.length();i++){
            char ch=newPassword.charAt(i);
            if((ch >= 'A')&& (ch <= 'Z')){
                capital=true;
            }
            else if((ch >= 'a')&& (ch <= 'z')){
                small=true;
            }
            else if ((ch >='0') && (ch <= '9')) {
                digit=true;
            }
            else{
                special=false;
            }
        }
        if(capital && small && digit && special==true){
            return true;
        }
        return false;
    }
}
