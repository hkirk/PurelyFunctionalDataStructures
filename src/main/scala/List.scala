/**
  * Created by hki on 27-05-2016.
  */
/**
  * Created by hki on 27-05-2016.
  */

sealed abstract class List[+E] {
  def isEmpty: Boolean

  def head: E
  def tail: List[E]
}

class ::[E](private val hd: E, private val tl: List[E]) extends List[E] {
  override def isEmpty: Boolean = false
  override def tail: List[E] = tl
  override def head: E = hd
}

case object Empty extends List[Nothing] {
  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("Nil do not contain head")

  override def tail: List[Nothing] = throw new UnsupportedOperationException("Nil do not contain tail")
}

