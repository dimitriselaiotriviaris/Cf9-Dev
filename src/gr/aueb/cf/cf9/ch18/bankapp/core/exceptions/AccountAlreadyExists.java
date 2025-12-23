package gr.aueb.cf.cf9.ch18.bankapp.core.exceptions;

public class AccountAlreadyExists extends Exception{

    public AccountAlreadyExists(String message){
        super(message);
    }
}
