package model.edu.cofc.cs656.models;

public class UserPayment {
		private User u;
		private Payment p;

		public UserPayment(User u, Payment p) {
			super();
			this.u = u;
			this.p = p;
			System.out.println(u + "\n       " + p);
		}
		@Override
		public String toString() {
			return "UserPayment [u=" + u + ", p=" + p + "]";
		}
		public User getU() {
			return u;
		}
		public void setU(User u) {
			this.u = u;
		}
		public Payment getP() {
			return p;
		}
		public void setP(Payment p) {
			this.p = p;
		}
		
		
}
