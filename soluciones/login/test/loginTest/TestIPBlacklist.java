package loginTest;

import static org.easymock.EasyMock.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import login.IPBlacklist;
import login.LoginService;
import login.Utils;

public class TestIPBlacklist {
    private IPBlacklist ipblacklist;
    private LoginService service;

    @Before
    public void setUp() {
         ipblacklist = new IPBlacklist();
         service = createMock(LoginService.class);
         ipblacklist.setService(service);
    }

    @Test
     public void testBlacklist() {
          String ip = "200.139.31.3";
          String userName = "testUserName";
          String password = "testPassword";
          String passwordHash = Utils.getPasswordHashMD5(password);

          expect(service.login(ip, userName, passwordHash)).andReturn(false).times(3);
          replay(service);
          
          assertFalse(ipblacklist.login(ip, userName, password));
          assertFalse(ipblacklist.login(ip, userName, password));
          assertFalse(ipblacklist.login(ip, userName, password));
          assertTrue(ipblacklist.blacklisted(ip));

          verify(service);
     }
    
    @Test
    public void testLogin() {
         String ip = "200.139.31.3";
         String userName = "testUserName";
         String password = "testPassword";
         String passwordHash = Utils.getPasswordHashMD5(password);

         expect(service.login(ip, userName, passwordHash)).andReturn(false);
         expect(service.login(ip, userName, passwordHash)).andReturn(true);
         replay(service);
         
         assertFalse(ipblacklist.login(ip, userName, password));
         assertTrue(ipblacklist.login(ip, userName, password));
         assertFalse(ipblacklist.blacklisted(ip));
         verify(service);
    }
}
