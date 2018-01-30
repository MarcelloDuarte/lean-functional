import scala.util.{Failure, Success, Try}

object Lesson2 {

  object a {
    /**
      * Exercise 2a
      *
      * Write a function maybeDivBy(dividend, divisor) that makes sure
      * division by zero produces a None and other divisors produce Some(quotient).
      */
    def maybeDivBy = ???
  }

  object b {
    /**
      * Exercise 2b
      *
      * Write a method tryDivBy that makes sure division by zero
      * produces a Arithmetic Exception
      * and other divisors produce a Success(result).
      */
    def tryDivBy = ???
  }

  object c {
    /**
      * Exercise 2c
      *
      * Write a fmap function that takes an Option and a function and returns:
      * - a None, if the Option is None
      * - otherwise, the result of the function applied to the value in the Some,
      *   wrapped in a fresh Some.
      */
    def fmap = ???
  }

  object d {
    /**
      * Exercise 2d
      *
      * Write a join function that takes an Option and a function (that also returns an Option)
      * and returns:
      * - a None, if the Option is None or the function returns None
      * - otherwise, the result of the function applied to the value in the Some,
      *   wrapped in a fresh Some.
      */
    def join = ???
  }

  object e {
    object Applicative {
      def pure[A](a: A): Option[A] = Some(a)
      def ap[A,B](fa: Option[A])(ff: Option[A => B]): Option[B] = (fa,ff) match {
        case (None, _) => None
        case (Some(a), None) => None
        case (Some(a), Some(f)) => Some(f(a))
      }
      /**
        * Exercise 2e
        *
        * Write a map function for our Applicative
        * only by composing the given pure and ap (apply) implementations.
        */
      def map = ???
    }
  }
}
