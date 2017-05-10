import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.diffblue.java_testcase.Reflector;

public class UserTest {

  /* testedClasses: User */


  /*
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 1 (line 17)
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 2 (line 17)
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 3 (line 17)
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 5 (line 20)
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 6 (line 20)
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 8 (line 20)
  */

  @org.junit.Test
  public void com_diffblue_javatest_nestedobjects_User_checkItemCost_24da09b75dfbfffb_000() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.nestedobjects.subpackage.Item param_0 = (com.diffblue.javatest.nestedobjects.subpackage.Item) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Reflector.setField(param_0, "cost", 0);
    com.diffblue.javatest.nestedobjects.subpackage.Order param_1 = (com.diffblue.javatest.nestedobjects.subpackage.Order) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Reflector.setField(param_1, "item", param_0);
    com.diffblue.javatest.nestedobjects.User param_2 = (com.diffblue.javatest.nestedobjects.User) Reflector.getInstance("com.diffblue.javatest.nestedobjects.User");
    Reflector.setField(param_2, "order", param_1);
    com.diffblue.javatest.nestedobjects.subpackage.Item param_3 = (com.diffblue.javatest.nestedobjects.subpackage.Item) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Reflector.setField(param_3, "cost", 0);
    com.diffblue.javatest.nestedobjects.subpackage.Item item = param_3;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.nestedobjects.User");
    Method m = c.getDeclaredMethod("checkItemCost", Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Item"));
    m.setAccessible(true);
    boolean retval = (boolean) m.invoke(param_2, item);

    /* check return value */
    assertEquals(true, retval);
  }


  /*
  * This test covers `boolean checkItemCost(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 7 (line 20)
  */

  @org.junit.Test
  public void com_diffblue_javatest_nestedobjects_User_checkItemCost_24da09b75dfbfffb_001() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.nestedobjects.subpackage.Item param_0 = (com.diffblue.javatest.nestedobjects.subpackage.Item) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Reflector.setField(param_0, "cost", -2147483648);
    com.diffblue.javatest.nestedobjects.subpackage.Order param_1 = (com.diffblue.javatest.nestedobjects.subpackage.Order) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Reflector.setField(param_1, "item", param_0);
    com.diffblue.javatest.nestedobjects.User param_2 = (com.diffblue.javatest.nestedobjects.User) Reflector.getInstance("com.diffblue.javatest.nestedobjects.User");
    Reflector.setField(param_2, "order", param_1);
    com.diffblue.javatest.nestedobjects.subpackage.Item param_3 = (com.diffblue.javatest.nestedobjects.subpackage.Item) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Reflector.setField(param_3, "cost", 0);
    com.diffblue.javatest.nestedobjects.subpackage.Item item = param_3;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.nestedobjects.User");
    Method m = c.getDeclaredMethod("checkItemCost", Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Item"));
    m.setAccessible(true);
    boolean retval = (boolean) m.invoke(param_2, item);

    /* check return value */
    assertEquals(false, retval);
  }

}