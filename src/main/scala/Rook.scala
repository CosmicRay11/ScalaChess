class Rook (x: Int, y: Int, white: Boolean) extends Piece(x, y, white) {
  override val name: Char = 'P'

  override def getValid(b: Board): List[(Int, Int)] = {

  }
}