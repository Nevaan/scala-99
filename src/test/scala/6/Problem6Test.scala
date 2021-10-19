package `6`
import org.scalatest.funsuite.AnyFunSuite

class Problem6Test extends AnyFunSuite:

  test("should return false for nil") {
    val isPalindrome = Problem6.solve(Nil)
    assert(!isPalindrome)
  }

  test("should return false for empty list") {
    val isPalindrome = Problem6.solve(List())
    assert(!isPalindrome)
  }

  test("should return false for one element list") {
    val isPalindrome = Problem6.solve(List(1))
    assert(!isPalindrome)
  }

  test("should return true for odd-length multielement palindrome list") {
    val isPalindrome = Problem6.solve(List(1, 2, 3, 2, 1))
    assert(isPalindrome)
  }

    test("should return true for even-length multielement palindrome list") {
    val isPalindrome = Problem6.solve(List(1, 2, 2, 1))
    assert(isPalindrome)
  }

   test("should return false for multielement non-palindrome list") {
    val isPalindrome = Problem6.solve(List(1,2,3))
    assert(!isPalindrome)
  }

  test("should return false for nil (recursive)") {
    val isPalindrome = Problem6.solveRecursive(Nil)
    assert(!isPalindrome)
  }

  test("should return false for empty list (recursive)") {
    val isPalindrome = Problem6.solveRecursive(List())
    assert(!isPalindrome)
  }

  test("should return false for one element list (recursive)") {
    // works differently - for recursive approach, single element list must be treated as palindrome
    val isPalindrome = Problem6.solveRecursive(List(1))
    assert(isPalindrome)
  }

  test("should return true for  odd-length multielement palindrome list (recursive)") {
    val isPalindrome = Problem6.solveRecursive(List(1, 2, 3, 2, 1))
    assert(isPalindrome)
  }

    test("should return true for  even-length multielement palindrome list (recursive)") {
    val isPalindrome = Problem6.solveRecursive(List(1, 2, 2, 1))
    assert(isPalindrome)
  }

   test("should return false for multielement non-palindrome list (recursive)") {
    val isPalindrome = Problem6.solveRecursive(List(1,2,3))
    assert(!isPalindrome)
  }

    test("should return false for nil (loop)") {
    val isPalindrome = Problem6.solveWithLoop(Nil)
    assert(!isPalindrome)
  }

  test("should return false for empty list (loop)") {
    val isPalindrome = Problem6.solveWithLoop(List())
    assert(!isPalindrome)
  }

  test("should return false for one element list (loop)") {
    val isPalindrome = Problem6.solveWithLoop(List(1))
    assert(!isPalindrome)
  }

  test("should return true for  odd-length multielement palindrome list (loop)") {
    val isPalindrome = Problem6.solveWithLoop(List(1, 2, 3, 2, 1))
    assert(isPalindrome)
  }

    test("should return true for  even-length multielement palindrome list (loop)") {
    val isPalindrome = Problem6.solveWithLoop(List(1, 2, 2, 1))
    assert(isPalindrome)
  }

   test("should return false for multielement non-palindrome list (loop)") {
    val isPalindrome = Problem6.solveWithLoop(List(1,2,3))
    assert(!isPalindrome)
  }

end Problem6Test
    