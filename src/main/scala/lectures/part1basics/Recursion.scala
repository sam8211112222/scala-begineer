package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  // if n is a large amount of number, will occur stackoverflow error
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * (factorial(n - 1))
  }

  println(factorial(5))

  // use a helper function to solve this
  def anotherFactorial(n: Int): BigInt = {
    // add @tailrec annotation, it will check if this method is a tail recursive
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  println(anotherFactorial(10000))
}
