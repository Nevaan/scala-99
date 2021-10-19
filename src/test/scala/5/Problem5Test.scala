package `5`
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers._

class Problem5Test extends AnyFunSuite with should.Matchers:

  test("should return list for empty list as input") {
    val result = Problem5.solve(List())
    result shouldBe List()
  }
  
  test("should return list for nil as input") {
    val result = Problem5.solve(Nil)
    result shouldBe List()
  }

  test("should reverse one-element sequence") {
    val result = Problem5.solve(List(4))
    result shouldBe List(4)
  }

  test("should reverse multielement sequence") {
    val result = Problem5.solve(List(1, 1, 2, 3, 5, 8))
    result shouldBe List(8, 5, 3, 2, 1, 1)
  }

  test("should return list for empty list as input (recursive)") {
    val result = Problem5.solveRecursive(List())
    result shouldBe List()
  }
  
  test("should return list for nil as input (recursive)") {
    val result = Problem5.solveRecursive(Nil)
    result shouldBe List()
  }

  test("should reverse one-element sequence (recursive)") {
    val result = Problem5.solveRecursive(List(4))
    result shouldBe List(4)
  }

  test("should reverse multielement sequence (recursive)") {
    val result = Problem5.solveRecursive(List(1, 1, 2, 3, 5, 8))
    result shouldBe List(8, 5, 3, 2, 1, 1)
  }

end Problem5Test
    