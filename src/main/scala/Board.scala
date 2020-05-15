class Board {
  val board: Array[Array[Option[Piece]]] = Board.start

  override def toString: String = {
    val banner = "-" * 8
    val sideBanner = '|'
    var str = banner + "\n"
    for (i<-0 to 7) {
      str += sideBanner
      for (j<-0 to 7) {
        val squareString = board(i)(j) match {
          case Some(piece) => piece.toString
          case None        => "."
        }
        str += squareString
        if (j != 7) {str += " "}
      }
      str += sideBanner + "\n"
    }
    str += banner
    str
  }

  def apply(x: Int)(y:Int): Option[Piece] = {
    board(x)(y)
  }

  def apply_=(p:Option[Piece])(x:Int)(y:Int): Unit = {
    print(p)
  }
}

object Board {

  private val start = Array.ofDim[Option[Piece]](8,8)
  fill_start

  // fill the board initially - white is in rows 0 and 1
  private def fill_start: Unit = {
    for (i<-0 to 7) { for (j<-0 to 7) {
      if (i != 1 && i != 6) { start(i)(j) = None }
      else { start(i)(j) = Some(new Pawn(i, j, i == 1)) } // white if i == 1, black otherwise
    }}
    for (i <- Array[Int](0,7)) {
      start(i)(0) = Some(new Rook(0,0,i == 0))
      start(i)(1) = Some(new Knight(0,1,i == 0))
      start(i)(2) = Some(new Bishop(0,2,i == 0))
      start(i)(3) = Some(new Queen(0,3,i == 0))
      start(i)(4) = Some(new King(0,4,i == 0))
      start(i)(5) = Some(new Bishop(0,5,i == 0))
      start(i)(6) = Some(new Knight(0,6,i == 0))
      start(i)(7) = Some(new Rook(0,7,i == 0))
    }


  }

  def main(args: Array[String]): Unit = {
    print(start)
  }
}