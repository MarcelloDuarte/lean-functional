import scala.annotation.tailrec

object Lesson1 {

  object a {
    /**
      * Exercise 1a
      *
      * Define a function hello that takes a String
      * and produces a greeting with "Hello, " plus the given String.
      */
    def hello = ???
  }

  object b {
    /**
      * Exercise 1b
      *
      * Declare a val hello that returns a function that receives no argument
      * and produces a greeting with "Hello, Scala".
      */
    val hello = ???
  }

  object c {
    /**
      * Exercise 1c
      *
      * Define a function findFirst that takes an array and a predicate and
      * returns the index of the first item in the array to satisfy the predicate.
      */
    def findFirst = ???
  }

  object d {
    /**
      * Exercise 1d
      *
      * Define a function curry that takes a function f with 2 arguments and returns
      * a function. This function takes one argument and also returns a function,
      * which takes a second argument and apply both to the f function.
      */
    def curry = ???
  }

  object e {
    /**
      * Exercise 1e
      *
      * Define a function compose that takes 2 functions and returns a function.
      * The returned function takes one argument, applies the second function to it
      * then it applies the first function to the result.
      */
    def compose = ???
  }
}
