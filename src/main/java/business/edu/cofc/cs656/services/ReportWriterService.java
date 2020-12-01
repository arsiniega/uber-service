package business.edu.cofc.cs656.services;

import java.util.ArrayList;

import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Payment;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.UserPayment;

public class ReportWriterService {
	
	private ArrayList<UserPayment> signUpArr;

	public ReportWriterService(ArrayList<UserPayment> signUpArr) {
		super();
		this.signUpArr = signUpArr;
	}
	
	public void reportAllUsers() {
		System.out.println("[Report All Users]");
		for (UserPayment user: signUpArr) {
			if (isRenter(user.getU()))
				System.out.println("Renter " + user.getU().getUserID() + " " + user.getU().getUserProfile().getName());
			else if (isDriver(user.getU())) {
				System.out.println("Driver " + user.getU().getUserID() + " " + user.getU().getUserProfile().getName());
			}
		}
	}
	
	public void reportFullUserInfo() {
		System.out.println("[Report Full User Info]");
		for (UserPayment user: signUpArr) {
			System.out.println("User " + user.toString());		
		}
	}
	
	public void reportAllUserPayments() {
		System.out.println("[Report All User Payments]");
		for (UserPayment user: signUpArr) {
				System.out.println("User " + user.getU().getUserID() + " " + user.getU().getUserProfile().getName() +
						" " + user.getP().getPayment() + " " + user.getP().getPaymentSubscription());
			
		}
	}
	
	public void reportOnlyValidMonthlyDiscounts() {
		System.out.println("[Report Valid Monthly Discounts]");
		for (UserPayment user: signUpArr) {
			    if (user.getP().getDiscountRate() > 0.0)
				System.out.println((user.getP().getDiscountRate() * 100)  +"% discount for User " + user.getU().getUserID() + 
						" " + user.getU().getUserProfile().getName() +
						" " + user.getP().getPaymentSubscription() + 
						" " + user.getP().getPayment());
			
		}
	}
	
	public void reportOnlyInvalidMonthlyDiscounts() {
		System.out.println("[Report Invalid Monthly Discounts]");
		for (UserPayment user: signUpArr) {
			    if (!(user.getP().getDiscountRate() > 0.0) && user.getP().isPaymentSubscription())
				System.out.println((user.getP().getDiscountRate() * 100)  +"% discount for User " + user.getU().getUserID() + 
						" " + user.getU().getUserProfile().getName() +
						" " + user.getP().getPaymentSubscription() + 
						" " + user.getP().getPayment());
			
		}
	}

	public void reportValidNonMonthlyDiscounts() {
		System.out.println("[Report Valid One-Time Monthly Subscriptions]");
		for (UserPayment user: signUpArr) {
			    if (!(user.getP().isPaymentSubscription()) && validPayment(user.getP()))
				System.out.println(("User " + user.getU().getUserID() + 
						" " + user.getU().getUserProfile().getName() +
						" " + user.getP().getPaymentSubscription() + 
						" " + user.getP().getPayment()));
			
		}
	}
	
	public void reportInvalidNonMonthlyDiscounts() {
		System.out.println("[Report Invalid One-Time Monthly Subscriptions]");
		for (UserPayment user: signUpArr) {
			    if (!user.getP().isPaymentSubscription() && !validPayment(user.getP()))
				System.out.println(("User " + user.getU().getUserID() + 
						" " + user.getU().getUserProfile().getName() +
						" " + user.getP().getPaymentSubscription() + 
						" " + user.getP().getPayment()));
			
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
	
	private boolean isDriver(User u) {
		if (u instanceof Driver) {
			return true;
		}
		return false;
	}
	
	private boolean isRenter(User u) {
		if (u instanceof Renter) {
			return true;
		}
		return false;		
	}
	
}
