abstract class Piece (var x_ : Int, var y_ : Int) {
  val isWhite: Boolean
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

  def getValid(b: Board): List[Char]
  def isValid(b: Board, move: (Int, Int)): Unit = {
    val m, n = move

  }
}
