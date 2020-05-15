class Queen(x: Int, y:Int, white: Boolean) extends Piece(x, y) {
  override val isWhite: Boolean = white
  override val name: Char = 'Q'

  override def getValid(b: Board): List[Char] = {

  }
}
