package test

object Hello {
  def main(args: Array[String]) {
    val calc = new Calculator("HP")
    println(calc.color)
    println(calc.add(3, 4))

    val c = new C
    println(c.functionInc)
    val cc = c.methodInc
    println(c.acc)
    val u = cc
    println(c.acc)

    val scCalc = new ScientificCalculator("TI")
    println(scCalc.color)
    println(scCalc.log(2, 10))

    val circle = new Circle(21.5)
    println(circle.getArea)
  }

  def multiply(n: Int)(m: Int): Int = {
    n * m
  }

  val timesTwo = multiply(2) _

  def capitalizeAll(args: String*) = {
    args.map({ a => a.capitalize })
  }

  class C {
    var acc = 0
    def methodInc = { acc += 1 }
    def functionInc = { () => acc += 1 }
  }
}