// user class for storing passwords and ID

public class User {

	private String id;
	private int pass;

	public User() {
		this.id = "";
		this.pass = 0;
	}

	// id getter
	public String getID () {
		return this.id;
	}

	// pass getter
	public int getPass() {
		return this.pass;
	}

	// id setter
	public void setID(String value) {
		id = value;
	}

	// passsetter
		public void setPass(int value) {
			pass = value;
		}

	// toString override for custom object logging
	@Override
	public String toString () {
		String pUser = "User: " + getID();
		String pPass = "Pass: " + getPass();
		return pUser + " " + pPass;
	}
}
