import main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.test;
class Remove2CharsTest
{
 Remove2Chars r;
 @BeforeEach
 void setUp()
 {
  r=new Remove2Chars();
 }
 @Test
 void testEmptyChar()
 {
  String actual=r.remove("");
  assertEquals("",actual);
 }
 @Test
 void test1chars()
 {
  String actual=r.remove("ABCD");
  assertEquals("BCD",actual);
 }
 @Test
 void test2Chars()
 {
  String actual=r.remove("BACD");
  assertEquals("BCD",actual);
 }
 @Test
 void test12chars()
 {
  String actual=r.remove("AACD");
  assertEquals("CD",actual);
 }
 @Test
 void testchars()
 {
  String actual=r.remove("BBAA");
  assertEquals("BBAA",actual);
 }
 @Test
 void test123chars()
 {
  String actual=r.remove("AABAA");
  assertEquals("BAA",actual);
 }
}
