package model.edu.cofc.cs656.models;

public class Destination {

	private float DestinationGeocode;
	private String destinationCity;
	private String destinationState;

	public Destination(float destinationGeocode, String destinationCity, String destinationState) {
		super();
		DestinationGeocode = destinationGeocode;
		this.destinationCity = destinationCity;
		this.destinationState = destinationState;
	}

	@Override
	public String toString() {
		return "Destination [DestinationGeocode=" + DestinationGeocode + ", destinationCity=" + destinationCity
				+ ", destinationState=" + destinationState + "]";
	}


	public float getDestinationGeocode() {
		return DestinationGeocode;
	}



	public void setDestinationGeocode(float destinationGeocode) {
		DestinationGeocode = destinationGeocode;
	}



	public String getDestinationCity() {
		return destinationCity;
	}



	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}



	public String getDestinationState() {
		return destinationState;
	}



	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}

//	private void convertAddresstoDestination(String addr) {
//
//	}
//
//	private void convertDestinationGeotoAddress(String addr) {
//
//	}

}
