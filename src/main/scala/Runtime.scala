object Runtime{
  def main(args: Array[String]): Unit = {
    val p = new Board
    print(p.toString)
    val q = new Queen(4,4, true)
  }
}
