package model.edu.cofc.cs656.models;

public class Driver extends User{
	
	public boolean isVerifiedDriver;
	
	private AutoInfo driverInformation;
	
	public Driver(int userID, boolean isSignedUp, Profile userProfile,
			boolean isVerifiedDriver, AutoInfo driverInformation) {
		super(userID, isSignedUp, userProfile);
		this.isVerifiedDriver = isVerifiedDriver;
		this.driverInformation = driverInformation;
		//System.out.println("You've created a Driver");
	}


	
	@Override
	public String toString() {
		return super.toString();
	}

	public String fullToString() {
		return "Driver " + super.toString() + " " + driverInformation + 
				"\nVerified Driver = " + isVerifiedDriver;
	}
	
	public boolean isVerifiedDriver() {
		return isVerifiedDriver;
	}



	public void setVerifiedDriver(boolean isVerifiedDriver) {
		this.isVerifiedDriver = isVerifiedDriver;
	}



	public AutoInfo getDriverInformation() {
		return driverInformation;
	}



	public void setDriverInformation(AutoInfo driverInformation) {
		this.driverInformation = driverInformation;
	}


//	private boolean authenticateDriver() {
//		System.out.println("You're in authenticateDriver method");
//		return true;
//	}
//	
//	private void lookupRidePopup() {
//		System.out.println("You're in lookupRidePopup method");
//	}
//	
//	private void addAutoInfo() {
//		System.out.println("You're in addAutoInfo method");
//	}
	
}
