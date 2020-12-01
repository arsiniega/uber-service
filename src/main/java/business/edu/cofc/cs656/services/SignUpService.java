package business.edu.cofc.cs656.services;

import java.util.ArrayList;

import model.edu.cofc.cs656.models.AutoInfo;
import model.edu.cofc.cs656.models.Car;
import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.UserPayment;
import model.edu.cofc.cs656.models.Payment;
import model.edu.cofc.cs656.models.PaymentType;
import model.edu.cofc.cs656.models.Profile;

public class SignUpService {
	
	private ArrayList<UserPayment> signUpArr;
	
	public SignUpService() {
		signUpArr = new ArrayList<UserPayment>();
	}

	public void signUpUser(User u) {
		Payment pay = new Payment();
		UserPayment userPay = new UserPayment(u, pay);
		signUpArr.add(userPay);
		System.out.println("[[[Successfully added User]]]");
	}

	public void signUpUser(User u, Payment p) {
		setDiscountForMonthlySubscription(p);
		UserPayment userPay = new UserPayment(u, p);
		signUpArr.add(userPay);
		System.out.println("[[[Successfully added User and Payment]]]");
	}
	

	public void printUserArray() {
		for (UserPayment userPay: signUpArr) {
			if (validPayment(userPay.getP()))
				System.out.println("Payment validated for " + userPay.getU().getUserProfile().getName());
			else
				System.out.println("Payment NOT validated for " + userPay.getU().getUserProfile().getName());
		}
		
	}
	
	private boolean validPayment(Payment p) {
		if ( (p.getPayment().getAccount().length() == 12 && 
				p.getPayment().getRouting().length() == 8)
			 || (p.getPayment().getGiftCard().contains("UBER")) )
			return true;
		else
			return false;
	}
	
	private void setDiscountForMonthlySubscription(Payment p) {
		if (validPayment(p) && p.isPaymentSubscription()) {
			System.out.println("[[[Valid payment qualifies for 10% discount]]]");
			p.setDiscountRate(0.1);
		} else
			System.out.println("[[[Payment not valid or monthly subscription not activated]]]");
	}
	
	
	public ArrayList<UserPayment> getSignUpArr() {
		return signUpArr;
	}

	public static void main( String[] args ) {
        System.out.println( "You're in SignUpService.");
        
        Profile p1 = new Profile("Alan", "Smith", "843-428-0091", 4.5);
        Renter r1 = new Renter(1, false, p1);
        System.out.println(r1.toString());
        
        // Second user, to be signedUp Driver requires isVerifiedDriver from AutoInfo
        
        Profile p2 = new Profile("Otto", "Mann", "(417) 848-2213", 3.5);
        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
        AutoInfo d1AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
        Driver d1 = new Driver(2, false, p2, false, d1AutoInfo);
        System.out.println(d1.toString());
        
        Profile p3 = new Profile("Corp", "Uber", "843-428-0091", 4.5);
        Renter r2 = new Renter(1, false, p3);
        
        PaymentType pt1 = new PaymentType("000777999102", "00804231"); // valid
        PaymentType pt2 = new PaymentType("GIFTCARD-UBER"); // valid
        PaymentType pt3 = new PaymentType("777999102", "00804231"); // invalid
        PaymentType pt4 = new PaymentType("UBER-GIFTCARD-LYFT"); // invalid
        
        
        Payment pay1 = new Payment(pt2,true);
        Payment pay2 = new Payment(pt1,false);
        Payment pay3 = new Payment(pt3,true);
        Payment pay4 = new Payment(pt4,false);
        
        SignUpService service = new SignUpService();
        service.signUpUser(r1);
        service.signUpUser(d1);
        service.signUpUser(r2,pay1);
        service.signUpUser(r1,pay2);
        service.signUpUser(d1,pay3);
        service.signUpUser(d1,pay4);
        
        service.printUserArray();
    }
	
}
