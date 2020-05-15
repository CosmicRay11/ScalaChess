class Move(init: (Int, Int), fin: (Int, Int), board: Board) {
  def isValid: Boolean = {
    val p1 = board(init._1)(init._2)
    if (p1.isDefined) {
      true
    }
    false
  }
}
