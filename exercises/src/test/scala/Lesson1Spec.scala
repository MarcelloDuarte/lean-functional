import org.scalatest.{FunSpec, Matchers}

class Lesson1Spec extends FunSpec with Matchers {

  describe("Lesson 1") {

    it("completes exercise 1a") {
      Lesson1.a.hello("Scala") should be ("Hello, Scala")
    }

//    it("completes exercise 1b") {
//      Lesson1.b.hello() should be ("Hello, Scala")
//    }
//
//    it("completes exercise 1c") {
//      Lesson1.c.findFirst(Array(1,2,3), (x:Int) => x == 2) should be (1)
//    }
//
//    it("completes exercise 1d") {
//      val curried = Lesson1.d.curry((x:Int, y:Int) => x + y)
//      curried(1)(2) should be (3)
//    }
//
//    it ("completes exercise 1e") {
//      val reflected = (angle: Double) => math.Pi / 2 - angle
//      def cos = reflected andThen math.sin
//      cos(90) should be (Lesson1.e.compose(math.sin, reflected)(90))
//    }
  }
}