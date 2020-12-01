package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.models.Origin;
import model.edu.cofc.cs656.models.Destination;

public class EstimateService {

	private double approximateRenterCost;
	private double approximateDriverProfit;
	private double approximateDistance;
	private double boostMultiplier;
	
	private double checkBoost(Origin orig, Destination dest) {
		return 1.2;
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in Estimate.");
    }
}
