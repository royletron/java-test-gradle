import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.diffblue.java_testcase.Reflector;

public class TicTacToeTest {

  /* testedClasses: TicTacToe */


  /*
  * This test covers `void <init>()' block 1 (line 5)
  * This test covers `void <init>()' block 2 (line 5)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe__init__7b9173441648d1f6_000() throws Exception {

    /* creating new object to test constructor */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Constructor<?> ctor = c.getDeclaredConstructor();
    ctor.setAccessible(true);
    Object instance=ctor.newInstance();

    /* Method return type is void, or not expected to return */
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 1 (line 20)
  * This test covers `byte checkTicTacToePosition(byte [])' block 3 (line 25)
  * This test covers `byte checkTicTacToePosition(byte [])' block 4 (line 26)
  * This test covers `byte checkTicTacToePosition(byte [])' block 5 (line 26)
  * This test covers `byte checkTicTacToePosition(byte [])' block 6 (line 27)
  * This test covers `byte checkTicTacToePosition(byte [])' block 7 (line 28)
  * This test covers `byte checkTicTacToePosition(byte [])' block 8 (line 29)
  * This test covers `byte checkTicTacToePosition(byte [])' block 10 (line 31)
  * This test covers `byte checkTicTacToePosition(byte [])' block 12 (line 26)
  * This test covers `byte checkTicTacToePosition(byte [])' block 13 (line 37)
  * This test covers `byte checkTicTacToePosition(byte [])' block 14 (line 37)
  * This test covers `byte checkTicTacToePosition(byte [])' block 17 (line 44)
  * This test covers `byte checkTicTacToePosition(byte [])' block 18 (line 44)
  * This test covers `byte checkTicTacToePosition(byte [])' block 19 (line 44)
  * This test covers `byte checkTicTacToePosition(byte [])' block 20 (line 45)
  * This test covers `byte checkTicTacToePosition(byte [])' block 21 (line 45)
  * This test covers `byte checkTicTacToePosition(byte [])' block 22 (line 46)
  * This test covers `byte checkTicTacToePosition(byte [])' block 24 (line 48)
  * This test covers `byte checkTicTacToePosition(byte [])' block 26 (line 53)
  * This test covers `byte checkTicTacToePosition(byte [])' block 27 (line 53)
  * This test covers `byte checkTicTacToePosition(byte [])' block 28 (line 54)
  * This test covers `byte checkTicTacToePosition(byte [])' block 30 (line 56)
  * This test covers `byte checkTicTacToePosition(byte [])' block 32 (line 44)
  * This test covers `byte checkTicTacToePosition(byte [])' block 33 (line 63)
  * This test covers `byte checkTicTacToePosition(byte [])' block 34 (line 63)
  * This test covers `byte checkTicTacToePosition(byte [])' block 35 (line 64)
  * This test covers `byte checkTicTacToePosition(byte [])' block 37 (line 66)
  * This test covers `byte checkTicTacToePosition(byte [])' block 39 (line 72)
  * This test covers `byte checkTicTacToePosition(byte [])' block 40 (line 72)
  * This test covers `byte checkTicTacToePosition(byte [])' block 41 (line 73)
  * This test covers `byte checkTicTacToePosition(byte [])' block 43 (line 75)
  * This test covers `byte checkTicTacToePosition(byte [])' block 45 (line 81)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_000() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)0, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 9 (line 30)
  * This test covers `byte checkTicTacToePosition(byte [])' block 44 (line 76)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_001() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)2, (byte)0, (byte)2, (byte)0, (byte)2, (byte)1, (byte)2, (byte)1, (byte)1 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)2, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 38 (line 67)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_002() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)2, (byte)0, (byte)2, (byte)1, (byte)2, (byte)0, (byte)1, (byte)1, (byte)2 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)2, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 42 (line 74)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_003() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)1, (byte)2, (byte)1, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)2 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)1, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 36 (line 65)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_004() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)1, (byte)0, (byte)2, (byte)0, (byte)1, (byte)2, (byte)0, (byte)2, (byte)1 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)1, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 31 (line 57)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_005() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)1, (byte)2, (byte)0, (byte)1, (byte)0, (byte)1, (byte)2, (byte)2, (byte)2 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)2, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 29 (line 55)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_006() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)1, (byte)2, (byte)0, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)1, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 25 (line 49)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_007() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)2, (byte)2, (byte)0, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)1 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)2, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 23 (line 47)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_008() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)1, (byte)2, (byte)0, (byte)1, (byte)1, (byte)2, (byte)1, (byte)0, (byte)2 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)1, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 16 (line 38)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_009() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)2, (byte)0, (byte)1, (byte)0, (byte)0, (byte)2, (byte)0, (byte)0, (byte)2 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)-1, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 11 (line 32)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_00a() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)2, (byte)34, (byte)2, (byte)1, (byte)1, (byte)66, (byte)2, (byte)40, (byte)0 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)-1, retval);
  }


  /*
  * This test covers `byte checkTicTacToePosition(byte [])' block 2 (line 21)
  */

  @org.junit.Test
  public void com_diffblue_javatest_TicTacToe_checkTicTacToePosition_3733cdfeb61f9b4d_00b() throws Exception {

    /* initialize test parameters */
    com.diffblue.javatest.TicTacToe param_0 = (com.diffblue.javatest.TicTacToe) Reflector.getInstance("com.diffblue.javatest.TicTacToe");
    byte [] dynamic_2_array = new byte []{ (byte)1, (byte)34, (byte)44, (byte)1, (byte)44, (byte)32, (byte)2, (byte)8 };
    byte [] dynamic_object1 = (byte [])dynamic_2_array;
    byte [] a = (byte [])dynamic_object1;

    /* call function under test */
    Class<?> c = Reflector.forName("com.diffblue.javatest.TicTacToe");
    Method m = c.getDeclaredMethod("checkTicTacToePosition", Reflector.forName("byte []"));
    m.setAccessible(true);
    byte retval = (byte) m.invoke(param_0, a);

    /* check return value */
    assertEquals((byte)-1, retval);
  }

}