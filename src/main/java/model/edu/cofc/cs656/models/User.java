package model.edu.cofc.cs656.models;

public class User {
	
	private int userID;
	private boolean isSignedUp;
	private Profile UserProfile;
    
    
    public User(int userID, boolean isSignedUp, Profile userProfile) {
		super();
		this.userID = userID;
		this.isSignedUp = isSignedUp;
		UserProfile = userProfile;
	}

	@Override
	public String toString() {
		return "ID: " + userID + " " + UserProfile.toString();
	}



	public int getUserID() {
		return userID;
	}




	public void setUserID(int userID) {
		this.userID = userID;
	}




	public boolean isSignedUp() {
		return isSignedUp;
	}




	public void setSignedUp(boolean isSignedUp) {
		this.isSignedUp = isSignedUp;
	}




	public Profile getUserProfile() {
		return UserProfile;
	}




	public void setUserProfile(Profile userProfile) {
		UserProfile = userProfile;
	}


}
