class Board {
  val start = Board.start

  override def toString: String = {
    val banner = "-" * 8
    val sideBanner = '|'
    var str = banner + "\n"
    for (i<-0 to 7) {
      str += sideBanner
      for (j<-0 to 7) {
        str += start(i)(j)
        if (j != 7) {str += " "}
      }
      str += sideBanner + "\n"
    }
    str += banner
    str
  }

  def apply(x: Int)(y:Int): Char = {
    start(x)(y)
  }

  def apply_=(p:Char)(x:Int)(y:Int): Unit = {
    print(p)
  }
}

object Board {

  private val start = Array.ofDim[Char](8,8)
  fill_start

  private def fill_start: Unit = {
    for (i<-0 to 7) { for (j<-0 to 7) {
      if (i != 1 && i != 6) { start(i)(j) = '.' }
      else { start(i)(j) = 'P' }
    }}
    val highPieces = Array[Char]('R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R')
    start(0) = highPieces
    start(7) = highPieces
  }

  def main(args: Array[String]): Unit = {
    print(start)
  }
}