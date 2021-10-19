package `4`
import org.scalatest.funsuite.AnyFunSuite

class Problem4Test extends AnyFunSuite:


  test("should return 0 if list is empty") {
    val result = Problem4.solve(List())
    assert(result == 0)
  }

  test("should return 0 if list is nil") {
    val result = Problem4.solve(Nil)
    assert(result == 0)
  }

  test("should return proper number of elements in nonempty list") {
    val result = Problem4.solve(List(1, 1, 2, 3, 5, 8))
    assert(result == 6)
  }

  test("should return 0 if list is empty (recursive)") {
    val result = Problem4.solveRecursive(List())
    assert(result == 0)
  }

  test("should return 0 if list is nil (recursive)") {
    val result = Problem4.solveRecursive(Nil)
    assert(result == 0)
  }

  test("should return proper number of elements in nonempty list (recursive)") {
    val result = Problem4.solveRecursive(List(1, 1, 2, 3, 5, 8))
    assert(result == 6)
  }

end Problem4Test
    