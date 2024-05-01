package classwork22.user;
//

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
public class UserTest {
    private String okEmail = "example@gmail.com";
    private String notOkEmail = "examplegmail.com";
    private String okPassword = "qwerty1234";
    private String notOkPassword = "qwerty";
    @Test
    public void testSetEmail () {
        User user = new User(okEmail, okPassword);
        Assertions.assertEquals(okEmail, user.getEmail());

        user = new User(notOkEmail, okPassword);
        Assertions.assertNull(user.getEmail());
    }
@Test
    public void testSetPassword ()  {
        User user = new User(okEmail,okPassword);
        Assertions.assertEquals(okPassword, user.getPassword());

        user = new User(okEmail, notOkPassword);
        Assertions.assertNull(user.getPassword());
    }
}
