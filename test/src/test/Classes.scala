package test

class Calculator(brand: String) {
  val color: String = if (brand == "HP") {
    "blue"
  } else if (brand == "TI") {
    "black"
  } else {
    "white"
  }

  def add(a: Int, b: Int): Int = a + b
}

class ScientificCalculator(brand: String) extends Calculator(brand) {
  def log(m: Double, base: Double): Double = math.log(m) / math.log(base)
}

abstract class Shape {
  def getArea(): Double
}

class Circle(r: Double) extends Shape {
  def getArea(): Double = r * r * math.Pi
}

trait Car {
  val brand: String
}

trait Test[K] {
  def remove(key: K)
}

