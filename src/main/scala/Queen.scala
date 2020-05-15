class Queen(x: Int, y: Int, white: Boolean) extends Piece(x, y) {
  override val name: Char = 'Q'

  override def getValid(b: Board): List[(Int, Int)] = {

  }
}
