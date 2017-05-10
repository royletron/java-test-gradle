import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.diffblue.java_testcase.Reflector;

public class ItemTest {

  /* testedClasses: Item */


  /*
  * This test covers `void <init>()' block 1 (line 5)
  * This test covers `void <init>()' block 2 (line 5)
  */

  @org.junit.Test
  public void com_diffblue_javatest_nestedobjects_subpackage_Item__init__26c961436def4c64_000() throws Exception {

    /* creating new object to test constructor */
    Class<?> c = Reflector.forName("com.diffblue.javatest.nestedobjects.subpackage.Item");
    Constructor<?> ctor = c.getDeclaredConstructor();
    ctor.setAccessible(true);
    Object instance=ctor.newInstance();

    /* Method return type is void, or not expected to return */
  }

}