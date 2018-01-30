import org.scalatest.{FunSpec, Matchers}
import scala.util.{Failure, Success}
import org.scalatest.TryValues._

class Lesson2Spec extends FunSpec with Matchers {

  describe("Lesson 2") {

//    describe ("completes exercise 2a") {
//      it ("returns None for divisor zero") {
//        Lesson2.a.maybeDivBy(42,0) should be (None)
//      }
//      it ("returns Some(quotient) otherwise") {
//        Lesson2.a.maybeDivBy(42,6) should be (Some(7))
//      }
//
//    }
//
//    describe ("completes exercise 2b") {
//      it ("returns Failure(ArithmeticException) for divisor zero") {
//        val failed = Lesson2.b.tryDivBy(42, 0)
//        failed should be a 'Failure
//        failed.failure.exception should have message "/ by zero"
//        failed.failure.exception shouldBe a [ArithmeticException]
//      }
//      it ("returns Success(quotient) otherwise") {
//        Lesson2.b.tryDivBy(42,6) should be (Success(7))
//      }
//    }
//
//    describe ("completes exercise 2c") {
//      it ("implements fmap for options") {
//        Lesson2.c.fmap(Some(42))(_+1) should be (Some(43))
//        Lesson2.c.fmap(None:Option[Int])(_+1) should be (None)
//      }
//    }
//
//    describe ("completes exercise 2d") {
//      it ("implements join for options") {
//        Lesson2.d.join(Some(42))((x:Int) => Some(x + 1)) should be (Some(43))
//        Lesson2.d.join(None:Option[Int])((x:Int) => Some(x + 1)) should be (None)
//        Lesson2.d.join(Some(42))((x:Int) => None) should be (None)
//      }
//    }
//
//    describe ("completes exercise 2e") {
//      it ("implements map for Applicative, based on pure and apply") {
//        Lesson2.e.Applicative.map(Some(42))(_+1) should be (Some(43))
//      }
//    }
  }
}
