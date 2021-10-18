package `1`

import org.scalatest.funsuite.AnyFunSuite

class Problem1Test extends AnyFunSuite: 
  
  test("should return last element") {
    val result = Problem1.solve(List(1, 1, 2, 3, 5, 8))
    assert(result == 8)
  }

  test ("should work recursevely with 1-element array") {
    val result = Problem1.solveRecursive(List(42))
    assert(result == 42)
  }

  test ("should work recursevely with n-element array") {
    val result = Problem1.solveRecursive(List(1, 1, 2, 3, 5, 8))
    assert(result == 8)
  }

  test ("should throw exception while trying to use it with null instead of Seq") {
    assertThrows[NoSuchElementException] {
      Problem1.solveRecursive(null)
    }
  }

end Problem1Test
