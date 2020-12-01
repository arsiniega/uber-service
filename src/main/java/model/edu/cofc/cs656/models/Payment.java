package model.edu.cofc.cs656.models;

public class Payment {
	
	private PaymentType payment;
	private boolean paymentSubscription;
	private double discountRate;
	
	public Payment(PaymentType payment, boolean paymentSubscription) {
		super();
		this.payment = payment;
		this.paymentSubscription = paymentSubscription;
		this.discountRate = 0;
	}
	
	public Payment(Payment p) {
		super();
		this.payment = p.payment;
		this.paymentSubscription = p.paymentSubscription;
		this.discountRate = p.discountRate;
	}

	public Payment() {
		super();
		this.payment = new PaymentType();
		this.paymentSubscription = false;
		this.discountRate = 0.0;
	}


	@Override
	public String toString() {
		return "Payment [payment=" + payment + ", paymentSubscription=" + paymentSubscription + ", discountRate="
				+ discountRate + "]";
	}



	public PaymentType getPayment() {
		return payment;
	}



	public void setPayment(PaymentType payment) {
		this.payment = payment;
	}



	public boolean isPaymentSubscription() {
		return paymentSubscription;
	}



	public void setPaymentSubscription(boolean paymentSubscription) {
		this.paymentSubscription = paymentSubscription;
	}
	
	public String getPaymentSubscription() {
		if (paymentSubscription)
			return "Monthly Subscription";
		else
			return "One-Time Subscription";
	}



	public double getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
