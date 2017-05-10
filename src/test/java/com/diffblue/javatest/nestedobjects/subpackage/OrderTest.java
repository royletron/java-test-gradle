import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.diffblue.java_testcase.Reflector;

public class OrderTest {

  /* testedClasses: Order */


  /*
  * This test covers `void <init>()' block 1 (line 5)
  * This test covers `void <init>()' block 2 (line 5)
  */

  @org.junit.Test
  public void com_diffblue_javatest_nestedobjects_subpackage_Order__init__cd194a26e33c3769_000() throws Exception {

    /* creating new object to test constructor */
    Class<?> c = Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Constructor<?> ctor = c.getDeclaredConstructor();
    ctor.setAccessible(true);
    Object instance=ctor.newInstance();

    /* Method return type is void, or not expected to return */
  }


  /*
  * This test covers `boolean hasItem()' block 1 (line 12)
  * This test covers `boolean hasItem()' block 3 (line 15)
  */

  @org.junit.Test
  public void com_diffblue_javatest_nestedobjects_subpackage_Order_hasItem_80d46076bb627038_000() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.nestedobjects.subpackage.Item param_0 = (com.diffblue.javatest.nestedobjects.subpackage.Item) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Reflector.setField(param_0, "cost", 0);
    com.diffblue.javatest.nestedobjects.subpackage.Order param_1 = (com.diffblue.javatest.nestedobjects.subpackage.Order) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Reflector.setField(param_1, "item", param_0);

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Method m = c.getDeclaredMethod("hasItem");
    m.setAccessible(true);
    boolean retval = (boolean) m.invoke(param_1);

    /* check return value */
    assertEquals(true, retval);
  }


  /*
  * This test covers `boolean setItem(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 1 (line 23)
  * This test covers `boolean setItem(com.diffblue.javatest.nestedobjects.subpackage.Item)' block 2 (line 23)
  */

  @org.junit.Test
  public void com_diffblue_javatest_nestedobjects_subpackage_Order_setItem_f722e68a139acb6c_000() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.nestedobjects.subpackage.Item param_0 = (com.diffblue.javatest.nestedobjects.subpackage.Item) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Reflector.setField(param_0, "cost", 0);
    com.diffblue.javatest.nestedobjects.subpackage.Order param_1 = (com.diffblue.javatest.nestedobjects.subpackage.Order) Reflector.getInstance("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Reflector.setField(param_1, "item", param_0);
    com.diffblue.javatest.nestedobjects.subpackage.Item item = null;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Order");
    Method m = c.getDeclaredMethod("setItem", Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Item"));
    m.setAccessible(true);
    boolean retval = (boolean) m.invoke(param_1, item);

    /* check return value */
    assertEquals(true, retval);
  }

}