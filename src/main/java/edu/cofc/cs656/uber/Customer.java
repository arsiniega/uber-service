package edu.cofc.cs656.uber;

import java.util.concurrent.atomic.AtomicLong;

public class Customer {
  private final long id;
  private final String firstName;
  private final String lastName;
  private final String cellphone;
  private final String rating;
  private static final AtomicLong counter = new AtomicLong(100);
 
  private Customer(CustomerBuilder builder){
    this.id = builder.id;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.cellphone = builder.cellphone;
    this.rating = builder.rating;
  }
  
  public Customer(){
    Customer cust = new Customer.CustomerBuilder().id().build();
      this.id = cust.getId();
      this.firstName = cust.getFirstName();
      this.lastName = cust.getLastName();
      this.cellphone = cust.getCellphone();
      this.rating = cust.getRating();
  }
  
  public Customer(long id, String firstName, String lastName,
      String celly, String rat){
      Customer cust = new Customer.CustomerBuilder().id()
           .firstName(firstName)
           .lastName(lastName)
           .cellphone(celly)
           .rating(rat)
           .build();
      this.id = cust.getId();
      this.firstName = cust.getFirstName();
      this.lastName = cust.getLastName();
      this.cellphone = cust.getCellphone();
      this.rating = cust.getRating();
  }
  
  public long getId(){
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }
  
  public String getCellphone(){
    return this.cellphone;
  }

  public String getRating() {
    return this.rating;
  }

  
  @Override
  public String toString(){
    return "ID: " + id 
        + " First: " + firstName
        + " Last: " + lastName + "\n"
        + "Cellphone: " + cellphone + "\n"
        + "Rating: " + rating;
  }  
  
  public static class CustomerBuilder{
    private long id;
    private String firstName = "";
    private String lastName = "";
    private String cellphone = "";
    private String rating = "";
    
    public CustomerBuilder id(){
      this.id = Customer.counter.getAndIncrement();
      return this;
    }

    public CustomerBuilder id(long id){
      this.id = id;
      return this;
    }
    
    public CustomerBuilder firstName(String firstName){
      this.firstName = firstName;
      return this;
    }

    public CustomerBuilder lastName(String lastName){
      this.lastName = lastName;
      return this;
    }
    
    public CustomerBuilder cellphone(String cellphone){
      this.cellphone = cellphone;
      return this;
    }
    
    public CustomerBuilder rating(String rating){
      this.rating = rating;
      return this;
    }
        
    public Customer build(){
      return new Customer(this);
    }
    
  }    
}
