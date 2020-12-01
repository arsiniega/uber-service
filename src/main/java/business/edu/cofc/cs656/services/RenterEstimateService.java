package business.edu.cofc.cs656.services;

public class RenterEstimateService extends EstimateService{
	
	private double getRenterCost() {
		return 2.0;
	}
	
	private double getArrivalTime() {
		return 1.0;
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in RenterEstimate.");
    }
}
