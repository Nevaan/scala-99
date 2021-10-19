import complete.DefaultParsers._
import java.io._

val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-99",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.9",
      "org.scalatest" %% "scalatest" % "3.2.9" % "test"
    )
  )

lazy val srcFile = settingKey[java.io.File]("Path to src dir")
srcFile := baseDirectory.value / "src" /  "main" / "scala"

lazy val testFile = settingKey[java.io.File]("Path to test dir")
testFile := baseDirectory.value / "src" / "test" / "scala"

val createProblem = inputKey[Unit]("creates problem")

createProblem := {
  val logger: Logger = sLog.value

  val srcDir: File = srcFile.value
  val testDir: File = testFile.value

  val args: Seq[String] = spaceDelimited("<arg>").parsed

  for (arg <- args) {
    
    val srcDirPath = s"${srcDir.absolutePath}/${arg}/"
    logger.info(s"Creating src directory ${srcDirPath}")
    new File(srcDirPath).mkdir()

    val srcClassPath = s"${srcDir.absolutePath}/${arg}/Problem${arg}.scala"
    logger.info(s"Creating src file ${srcClassPath}")
    val scrFile = new File(srcClassPath)
    scrFile.createNewFile()

    val srcPrintWriter = new PrintWriter(scrFile)
    srcPrintWriter.write(s"""
package `${arg}`

object Problem${arg} {
  def solve() = println("Problem${arg} dummy implementation")
}
    """)
    srcPrintWriter.close()

    val testDirPath = s"${testDir.absolutePath}/${arg}/"
    logger.info(s"Creating test directory ${testDirPath}")
    new File(testDirPath).mkdir()

    val testClassPath = s"${testDir.absolutePath}/${arg}/Problem${arg}Test.scala"
    logger.info(s"Creating test file ${srcClassPath}")
    val testFile = new File(testClassPath)
    testFile.createNewFile()

    val testPrintWriter = new PrintWriter(testFile)
    testPrintWriter.write(s"""
package `${arg}`
import org.scalatest.funsuite.AnyFunSuite

class Problem${arg}Test extends AnyFunSuite:

  test("should ") {
    val result = Problem${arg}.solve()
  }

end Problem${arg}Test
    """)
    testPrintWriter.close()

  }

}