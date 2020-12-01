package model.edu.cofc.cs656.models;

public class Profile {

	private String firstName;
	private String lastName;
	private String cellphone;
	private double rating;

	
	public Profile(String firstName, String lastName, String cellphone, double rating) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellphone = cellphone;
		this.rating = rating;
	}

	
	@Override
	public String toString() {
		return "Name: " + getName() + " Cell: " + cellphone + " Rating: " + rating + " stars";
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCellphone() {
		return cellphone;
	}



	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



//	private void updateProfile() {
//		
//	}
//	
//	private void updateImage() {
//		
//	}
	
}
