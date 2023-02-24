object SpaceAge {

  val secondsOnEarth = 31557600
  val secondsOnVenus = 0.61519726
  val secondsOnMercury = 0.2408467
  val secondsOnMars = 1.8808158
  val secondsOnJupiter = 11.862615
  val secondsOnSaturn = 29.447498
  val secondsOnUranus = 84.016846
  val secondOnNeptune = 164.79132
  def onEarth(age: Double): Double = age / secondsOnEarth
  def onVenus(age: Double): Double = age / secondsOnVenus / secondsOnEarth
  def onMercury(age: Double): Double = age / secondsOnMercury / secondsOnEarth
  def onMars(age: Double): Double = age / secondsOnMars / secondsOnEarth
  def onJupiter(age: Double): Double = age / secondsOnJupiter / secondsOnEarth
  def onSaturn(age: Double): Double = age / secondsOnSaturn / secondsOnEarth
  def onUranus(age: Double): Double = age / secondsOnUranus / secondsOnEarth
  def onNeptune(age: Double): Double = age / secondOnNeptune / secondsOnEarth

}
