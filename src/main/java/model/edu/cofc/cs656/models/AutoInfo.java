package model.edu.cofc.cs656.models;

public class AutoInfo {
	
	private String insuranceCompanyId;
	private String driverlicense;
	private Car car;

	public AutoInfo(String insuranceCompanyId, String driverlicense, Car car) {
		super();
		this.insuranceCompanyId = insuranceCompanyId;
		this.driverlicense = driverlicense;
		this.car = car;
	}

	@Override
	public String toString() {
		return "AutoInfo: " + insuranceCompanyId + "-" + driverlicense + " " + car;
	}


	public String getInsuranceCompanyId() {
		return insuranceCompanyId;
	}



	public void setInsuranceCompanyId(String insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}



	public String getDriverlicense() {
		return driverlicense;
	}



	public void setDriverlicense(String driverlicense) {
		this.driverlicense = driverlicense;
	}



	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

//	private void validateInsurance() {
//		
//	}
//	
//	private void validateDriverLicense() {
//		
//	}
//	
//	private void addCar(Car c) {
//		
//	}

}
