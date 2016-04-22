package design.patterns.factory.staticfactory

/**
  * Animal
  * 静态工厂
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 4/23/16 6:09 AM.
  */
trait Animal

class Bird extends Animal

class Mammal extends Animal

class Fish extends Animal

object Animal {
  def apply(animal: String): Animal = animal.toLowerCase match {
    case "bird" => new Bird
    case "mammal" => new Mammal
    case "fish" => new Fish
    case x: String => throw new RuntimeException(s"Unknown animal: $x")
  }
}
