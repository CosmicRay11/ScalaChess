abstract class Piece (var x_ : Int, var y_ : Int, white: Boolean) {
  val isWhite: Boolean = white
  val name: Char

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

  def getValid(b: Board): List[Char] = {
    val l = List[Char]
    for (i <- 0 to 7) {
      for (j <- 0 to 7) {
        val m = Move()
      }
    }


  }
  def isValid(b: Board, move: Move)
}
