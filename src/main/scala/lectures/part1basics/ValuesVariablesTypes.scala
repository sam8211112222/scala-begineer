package lectures.part1basics

object ValuesVariablesTypes extends App{

  // vals are immutable
  val x :Int = 42;
  println(x)

  // compiler can infer types
  val y ="Hi";
  println(y)

  // scala types as following
  val aInt:Int =1;
  val aBoolean:Boolean =true;
  val aChar:Char ='a';
  val aShort:Short =12;
  val aFloat:Float =1.1f;
  val aLong:Long =1L;
  val aDouble:Double =1.0;

  // variables
  var z :Int = 1;
  z = z+1;
  println(z);

}
