package `3`
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers._

class Problem3Test extends AnyFunSuite with should.Matchers:

  test("should return existing element with index 0") {
    val result = Problem3.solve(0, List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 1
  } 

  test("should return existing element with index 2") {
    val result = Problem3.solve(2, List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 2
  }

  test("should return existing element with index equal to list size") {
    val result = Problem3.solve(5, List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 8
  }

  test("should return nothing if element do not exists") {
    val result = Problem3.solve(12, List(1, 1, 2, 3, 5, 8))
    result shouldBe None
  }

  test("should return nothing if list is null") {
    val result = Problem3.solve(12, Nil)
    result shouldBe None
  }

  test("should return existing element with index 0 (recursive)") {
    val result = Problem3.solveRecursive(0, List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 1
  } 

  test("should return existing element with index 2 (recursive)") {
    val result = Problem3.solveRecursive(2, List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 2
  }

    test("should return existing element with index equal to list size (recursive)") {
    val result = Problem3.solveRecursive(5, List(1, 1, 2, 3, 5, 8))
    result.get shouldBe 8
  }

  test("should return nothing if element do not exists (recursive)") {
    val result = Problem3.solveRecursive(12, List(1, 1, 2, 3, 5, 8))
    result shouldBe None
  }

    test("should return nothing if list is null  (recursive)") {
    val result = Problem3.solveRecursive(12, Nil)
    result shouldBe None
  }

end Problem3Test
    