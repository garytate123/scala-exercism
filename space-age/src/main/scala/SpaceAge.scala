import UserInput.userInput
import Planets._

object SpaceAge extends App{

  def onEarth(age: Double): Double = userInput / secondsOnEarth
  def onVenus(age: Double): Double = userInput / secondsOnVenus / secondsOnEarth
  def onMercury(age: Double): Double = userInput / secondsOnMercury / secondsOnEarth
  def onMars(age: Double): Double = userInput / secondsOnMars / secondsOnEarth
  def onJupiter(age: Double): Double = userInput / secondsOnJupiter / secondsOnEarth
  def onSaturn(age: Double): Double = userInput / secondsOnSaturn / secondsOnEarth
  def onUranus(age: Double): Double = userInput / secondsOnUranus / secondsOnEarth
  def onNeptune(age: Double): Double = userInput / secondOnNeptune / secondsOnEarth

  println("")
  println(s"If you are from Earth, then you are " + SpaceAge.onEarth(userInput) + " years old.")
  println(s"If you are from Venus, then you are " + SpaceAge.onVenus(userInput) + " years old in Earth years")
  println(s"If you are from Mercury, then you are " + SpaceAge.onMercury(userInput) + " years old in Earth years")
  println(s"If you are from Jupitar, then you are " + SpaceAge.onJupiter(userInput) + " years old in Earth years")
  println(s"If you are from Saturn, then you are " + SpaceAge.onSaturn(userInput) + " years old in Earth years")
  println(s"If you are from Uranus, then you are " + SpaceAge.onUranus(userInput) + " years old in Earth years")
  println(s"If you are from Neptune, then you are " + SpaceAge.onNeptune(userInput) + " years old in Earth years")
  println("")

}
