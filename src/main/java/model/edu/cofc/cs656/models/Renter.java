package model.edu.cofc.cs656.models;

public class Renter extends User{
	
	private boolean renterPaymentValidated;

	public Renter(int userID, boolean isSignedUp, Profile userProfile) {
		super(userID, isSignedUp, userProfile);
		this.renterPaymentValidated = false;
		//System.out.println("You've created a Renter");
	}
	

	@Override
	public String toString() {
		return super.toString();
	}

	public String fullToString() {
		return "Renter " + super.toString() + "\nSubscription based = " + renterPaymentValidated;
	}

	
	public boolean isrenterPaymentValidated() {
		return renterPaymentValidated;
	}


	public void setrenterPaymentValidated(boolean renterPaymentValidated) {
		this.renterPaymentValidated = renterPaymentValidated;
	}


//	private void signIn(double RenterID) {
//		System.out.println("You're in signIn method");
//	}
//	
//	private void lookupRide() {
//		System.out.println("You're in lookupRide method");
//	}

}
