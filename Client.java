public class Client {
	private String name;
	private User _userList;
	private int _storageTime;
	private String _userName;
	private String password;
	public User _unnamed_User_;

  public void changeName(String name) {
    this.name = name;
  }

  public void changePassword(String password){
	this.password = password;
  }

	public void changeLogo() {
		throw new UnsupportedOperationException();
	}

	public void login() {
		throw new UnsupportedOperationException();
	}

  public void viewUser(Object aUser_user) {
    
  }

	public void viewUserStatement(Object aUser_user, Object aStatement_statement) {
		throw new UnsupportedOperationException();
	}

	public void changeStorageLength(Object aInt_time) {
		throw new UnsupportedOperationException();
	}

	public void searchUsers() {
		throw new UnsupportedOperationException();
	}

	public void downloadUserStatement(Object aUser_user, Object aStatement_statement) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}