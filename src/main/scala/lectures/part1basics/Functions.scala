package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hi", 3))

  def aParameterLessFunction(): Int = 40

  println(aParameterLessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Hi",3))

  // When you need loop, use recursion!

  // 120
  def factorial(n:Int):Int={
    if (n<=0) 1
    else n*(factorial(n-1))
  }
  println(factorial(5))

  def fib(n:Int):Int={
    if( n== 0 ||n==1) 1
    else fib(n-1)+fib(n-2)
  }
  println(fib(4))
}
