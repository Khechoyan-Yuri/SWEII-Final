/**
 * Created by Yuri Khechoyan on 1/1/2017.
 */

package com.sweng.customerqueue.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    //Variables
    @NotNull
    private    String firstName;

    @NotNull
    private    String lastName;

    @NotNull
    @Size(min=10, max=10)
    private    String mobileNumber;

    private    int place;

    public Customer(){
    }

    public Customer(String firstName, String lastName, String mobileNumber){
        //constructor for the customer
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;

    }

//SETTERS AND GETTERS

    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
}
