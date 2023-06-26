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


  // task
  //1.Contatenate a string n times
  @tailrec
  def stringConcatenate(stringNeedToConcat: String, times:Int,accumulator:String):String={
      if (times < 1) accumulator
      else stringConcatenate(stringNeedToConcat,times-1,accumulator+stringNeedToConcat)
  }
  println(  stringConcatenate("Test",3,""))
  //2.IsPrime function tail recursive

  def isPrime(n:Int):Boolean={
    @tailrec
    def isPrimeTailrec(t:Int, isStillPrime:Boolean):Boolean= {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }
      isPrimeTailrec(n/2,true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  //3.Fibonacci function, tail recursive

  def fib(n:Int):Int={

    @tailrec
    def fibHelper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i>= n)last
      else
        fibHelper(i+1, last+nextToLast, last)
    }

    if (n<=2)1
    else fibHelper(2, 1, 1)
  }
  println(fib(5))

}
