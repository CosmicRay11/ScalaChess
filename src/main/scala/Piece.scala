abstract class Piece (var x_ : Int, var y_ : Int, white: Boolean) {
  val isWhite: Boolean = white
  val name : Char

  override def toString: String = {
    if (isWhite) name.toUpper.toString
    else         name.toLower.toString
  }

  def x: Int = x_
  def y: Int = y_

  def x_=(x: Int): Unit ={
    require(0<=x && x<=7)
    x_ = x_
  }

  def y_=(x: Int): Unit ={
    require(0<=x && x<=7)
    x_ = x_
  }

  def getMoves(b: Board): List[Move] = {
    val l = List[Move]()
    for (i <- 0 to 7) {
      for (j <- 0 to 7) {
        val m = new Move((x,y), (i,j), b)
        if (m.isValid) {
          l :+ m
        }
      }
    }
    l
  }
  //def isValid(b: Board, move: Move): Boolean
}
