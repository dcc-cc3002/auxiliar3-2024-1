import munit.FunSuite
import scala.compiletime.uninitialized


class DummyTest extends FunSuite {
  private var n1: Int = uninitialized
  private var n2: Int = uninitialized

  override def beforeEach(context: BeforeEach): Unit = {
    n1 = 1
    n2 = 2
  }

  test("Dummy test") {
    assertEquals(n1, 1)
    assertEquals(n2, 2)
    assertEquals(n1 + n2, 3)
  }
  

}
