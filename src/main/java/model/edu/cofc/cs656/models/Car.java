package model.edu.cofc.cs656.models;

public class Car {
	
	private String Make;
	private String Model;
	private String Year;
	private String VIN;
	
	public Car(String make, String model, String year, String vIN) {
		super();
		Make = make;
		Model = model;
		Year = year;
		VIN = vIN;
	}
	
	@Override
	public String toString() {
		return "Car: " + Make + "-" + Model + "-" + Year + "-" + VIN;
	}
	

    public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

}
