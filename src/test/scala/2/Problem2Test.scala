package `2`
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers._

class Problem2Test extends AnyFunSuite with should.Matchers: 

  test("should return none from nil") {
    val result = Problem2.solve(Nil)
    result shouldBe None
  }

  test("should return none from empty list") {
    val result = Problem2.solve(List())
    result shouldBe None
  }

  test("should return last but one element from list with one element") {
    val result = Problem2.solve(List(8))
    result.get shouldBe 8
  }  

  test("should return last but one element from list with n elements") {
    val result = Problem2.solve(List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 5
  }

  test("should return none from nil (recursive)") {
    val result = Problem2.solveRecursive(Nil)
    result shouldBe None
  }

  test("should return none from empty list (recursive)") {
    val result = Problem2.solveRecursive(List())
    result shouldBe None
  }

  test("should return last but one element from list with one element (recursive)") {
    val result = Problem2.solveRecursive(List(8))
    result.get shouldBe 8
  }  

  test("should return last but one element from list with n elements (recursive)") {
    val result = Problem2.solveRecursive(List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 5
  }

end Problem2Test
