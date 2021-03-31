package com.capgemini.springAssignment.Q1;

public class Customer {
    private  int customerId;
    private String  customerName;
    private String customerContact;
    private Address customerAddress;


    public Customer(){}

    public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String  customerContact) {
        this.customerContact = customerContact;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void customerDetail(){
        System.out.println("Customer Id: "+getCustomerId()+"\n"+
                           "Name: "+getCustomerName()+"\n"+
                           "Customer Contact: "+getCustomerContact()+"\n"+
                            "Address: "+
                            "Street: "+getCustomerAddress().getStreet()+" City: "+getCustomerAddress().getCity()+" State: "+getCustomerAddress().getState()+" Country: "+getCustomerAddress().getCountry()+" zip: "+getCustomerAddress().getZip());
    }

}
