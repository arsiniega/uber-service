package model.edu.cofc.cs656.models;

public enum RideStatus {
	InProgress,
	NotStarted,
	Finished,
	Errored;
	
	public boolean getActiveRideStatus() {
		switch (this) {
		case InProgress:
			return true;
		default:
			return false;
		}
	}
}
