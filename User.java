public class User {
	private int accountNumber;
	private int socialSecurity;
	private String email;
	private Statement _currentStatement;
	private Statement _statementList;
	private String _address;
	private User _associatedAccounts;
	private String _password;
	public User _unnamed_User_;
	public Client _unnamed_Client_;
	public Statement _unnamed_Statement_;

  User(int accountNumber, int socialSecurity){
    this.accountNumber = accountNumber;
    this.socialSecurity = socialSecurity;
  }

  public void changeEmail(String email) {
    this.email = email;
  }
  public String getEmail(){
    return email;
  }

  public void viewStatement(Object Statement_statement) {
    throw new UnsupportedOperationException();
  }

	public void linkAccounts() {
		throw new UnsupportedOperationException();
	}

	public void switchAccounts() {
		throw new UnsupportedOperationException();
	}

  public String login() {
    return "" + accountNumber + socialSecurity;
  }

	public void searchStatements() {
		throw new UnsupportedOperationException();
	}

	public void downloadStatement() {
		throw new UnsupportedOperationException();
	}
}