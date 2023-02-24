object Queen {

  object QueenAttack {
    def canAttack(offense: Queen, defense: Queen) = {

      val xDiff = if (offense.x >= defense.x) {
        offense.x - defense.x
      } else {
        defense.x - offense.x
      }
      val yDiff = if (offense.y >= defense.y) {
        offense.y - defense.y
      } else {
        defense.y - offense.y
      }

      xDiff == 0 || yDiff == 0 || xDiff == yDiff
    }
  }

  object Queen {
    def create(x: Int, y: Int): Option[Queen] = {
      if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {
        Some(Queen(x, y))
      }
      else {
        None
      }
    }
  }

  case class Queen(x: Int, y: Int)

}