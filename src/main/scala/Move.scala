class Move(init: (Int, Int), fin: (Int, Int), board: Board) {
  def isValid: Boolean = {
    val p1 = board(init._1)(init._2)
    if (p1.isDefined) {
      val p2 = board(fin._1)(fin._2)
      if (!p2.isDefined || p2.get.isWhite != p1.get.isWhite) {
        val inCheckThen = true // mention castling somewhere here
        if (inCheckThen) {
          val inCheckNow = false
          if (!inCheckNow) {
            return true
          }
        }
      }
    }
    false
  }
}
