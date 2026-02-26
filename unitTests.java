


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class unitTests {
    
  @Test
  public void changeEmail(){
    User testUser = new User(1,  1);
    testUser.changeEmail("userid@email.com");
    String newEmail = testUser.getEmail();
    assertEquals("userid@email.com", newEmail);
  }

    @Test
  public void changeClientName(){
    Client testClient = new Client();
    testClient.changeName("consumerDigital");
    String newName = testClient.getName();
    assertEquals("consumerDigital", newName);
  }

    @Test
  public void changeClientEmail(){
    Client testClient = new Client();
    testClient.changePassword("12345");
    String newPassword = testClient.getPassword();
    assertEquals("12345", newPassword);
  }
/* 
  @Mock
  public Authenticator userAuthenticator;

  
  @Test
  public void testLogin(){
    User testUser = new User(1,  1);
    when(userAuthenticator.authenticate(11)).thenReturn(true);
    String newEmail = testUser.getEmail();
    assertEquals("userid@email.com", newEmail);
  }
*/

}
