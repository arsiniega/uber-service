package edu.cofc.cs656.uber;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import edu.cofc.cs656.uber.Customer.CustomerBuilder;

public class CustomerList {
  //private static final CopyOnWriteArrayList<Customer> cList = new CopyOnWriteArrayList<>();
	private static final ArrayList<Customer> cList = new ArrayList<>();

  static {
    // Create list of customers
    cList.add(
        new Customer.CustomerBuilder().id()
        .firstName("Alan")
        .lastName("Smith")
        .cellphone("(843) 428-0091")
        .rating("4.5")
        .build()
    );

    cList.add(
        new Customer.CustomerBuilder().id()
        .firstName("Bert")
        .lastName("Johnson")
        .cellphone("(994) 711-8516")
        .rating("4.2")
        .build()
    );

    cList.add(
        new Customer.CustomerBuilder().id()
        .firstName("Earl")
        .lastName("Brown")
        .cellphone("(704) 224-3467")
        .rating("4.0")
        .build()
    );

    cList.add(
        new Customer.CustomerBuilder().id()
        .firstName("Cassie")
        .lastName("Garcia")
        .cellphone("(575) 753-4424")
        .rating("4.1")
        .build()
    );

    cList.add(
        new Customer.CustomerBuilder().id()
        .firstName("Dalila")
        .lastName("Miller")
        .cellphone("(599) 392-8749")
        .rating("3.5")
        .build()
    );

  }
  
  private CustomerList(){}
  
  public static ArrayList<Customer> getInstance(){
    return cList;
  }
  
  public static void testList(){
    ArrayList<Customer> list = CustomerList.getInstance();
    list.stream()
        .forEach(i -> System.out.println(i));
    String cString = 
        list.stream()
        .map( c -> c.toString())
        .collect(Collectors.joining("\n"));
    System.out.println(cString);
  }
    
  public static void main(String[] args) {
    CustomerList.testList();
  }
  
}

