package model.edu.cofc.cs656.models;

public class Origin {

	private String originCity;
	private String originState;
	private float originGeocode;

	public Origin(String originCity, String originState, float originGeocode) {
		super();
		this.originCity = originCity;
		this.originState = originState;
		this.originGeocode = originGeocode;
	}

	
	@Override
	public String toString() {
		return "Origin [originCity=" + originCity + ", originState=" + originState + ", originGeocode=" + originGeocode
				+ "]";
	}



	public String getOriginCity() {
		return originCity;
	}



	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}



	public String getOriginState() {
		return originState;
	}



	public void setOriginState(String originState) {
		this.originState = originState;
	}



	public float getOriginGeocode() {
		return originGeocode;
	}



	public void setOriginGeocode(float originGeocode) {
		this.originGeocode = originGeocode;
	}

//	private void convertAddresstoOriginGeo(String addr) {
//		
//	}
//	
//	private void convertOriginGeotoAddress(String addr) {
//		
//	}
	
}
