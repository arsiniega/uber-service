package edu.cofc.cs656.uber;

import java.util.ArrayList;
import java.util.stream.Collectors;

import model.edu.cofc.cs656.models.AutoInfo;
import model.edu.cofc.cs656.models.Car;
import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Payment;
import model.edu.cofc.cs656.models.PaymentType;
import model.edu.cofc.cs656.models.Profile;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;

public class UberUserList {
	
	static int userid = 777;
	
	// Payment logic drives 10% discount 
	static boolean monthlySubscription = true; 
	static boolean oneTimePayment = false;
	
	// Signup logic 
	static boolean notSignedUp = false;
	static boolean signedUp = true;
	
	// Additional driver logic for verification purposes
	static boolean notVerifiedDriver = false;
	static boolean verifiedDriver = true;
	
	private static final ArrayList<User> uberList = new ArrayList<>();
	
	static {
        Profile pro1 = new Profile("Alan", "Smith", "(843) 428-0091", 4.5);
        Profile pro2 = new Profile("Bert", "Johnson", "(994) 711-8516", 4.2);
        Profile pro3 = new Profile("Earl", "Brown", "(704) 224-3467", 4.0);
        Profile pro4 = new Profile("Cassie", "Garcia", "(575) 753-4424", 4.1);
        Profile pro5 = new Profile("Dalila", "Miller", "(599) 392-8749", 3.5);
        Profile pro6 = new Profile("Ernie", "Davis", "(626) 526-0791", 5.0);
        Profile pro7 = new Profile("Anna", "Gonzalez", "(259) 694-5981", 4.9);
        Profile pro8 = new Profile("Otto", "Mann", "(417) 848-2213", 2.1);
        Profile pro9 = new Profile("Admin", "Istrator", "(999) 999-9999", 5.0);
        Profile pro10 = new Profile("Test", "User", "(231) 767-0480", 1.0);
        
        // dummy cars
        Car car1 = new Car("FORD", "F-150", "2009", "VIN1021");
        Car car2 = new Car("MAZDA", "CX-9", "2008", "VIN0099");
        Car car3 = new Car("TOYOTA", "TUNDRA", "1998", "VIN1199");
        
        // we will use these two automobile registrations for expediency 
        AutoInfo reg1 = new AutoInfo("GEICO123", "DLSC100542819", car1);
        AutoInfo reg2 = new AutoInfo("STATEFARM123", "DLSC100552312", car2);
        AutoInfo reg3 = new AutoInfo("GENERAL4478", "DLSC111342789", car3);
        
        Renter rent1 = new Renter(userid++, notSignedUp, pro1);
        Renter rent2 = new Renter(userid++, notSignedUp, pro2);
        Renter rent3 = new Renter(userid++, notSignedUp, pro3);
        Renter rent4 = new Renter(userid++, notSignedUp, pro4);
        Renter rent5 = new Renter(userid++, notSignedUp, pro5);
        Renter rent6 = new Renter(userid++, signedUp, pro9);
        Renter rent7 = new Renter(userid++, signedUp, pro10);

        Driver drive1 = new Driver(userid++, notSignedUp, pro6, verifiedDriver, reg1);
        Driver drive2 = new Driver(userid++, notSignedUp, pro7, verifiedDriver, reg2);
        Driver drive3 = new Driver(userid++, notSignedUp, pro8, notVerifiedDriver, reg3);
        
        uberList.add(rent1);
        uberList.add(rent2);
        uberList.add(rent3);
        uberList.add(rent4);
        uberList.add(rent5);
        uberList.add(rent6);
        uberList.add(rent7);
        uberList.add(drive1);
        uberList.add(drive2);
        uberList.add(drive3);
        
	}
	
	private UberUserList() {}
	
	public static ArrayList<User> getInstance(){
		return uberList;
	}
	
	public static void testList() {
		ArrayList<User> list = UberUserList.getInstance();
	    list.stream()
        .forEach(i -> System.out.println(i));
	    String cString = 
        list.stream()
        .map( c -> c.toString())
        .collect(Collectors.joining("\n"));
    //System.out.println(cString);
  }
    
  public static void main(String[] args) {
    UberUserList.testList();
  }
}
