import scala.collection.immutable

/**
  * Created by hki on 27-05-2016.
  */
trait Stack[E] {
  def empty(): Stack
  def isEmpty(stack: Stack): Boolean

  def cons(elem: E, stack: Stack): Stack
  def head(stack: Stack): E
  def tail(stack: Stack): Stack
}

class List[E] extends Stack[E] {
  type Stack = immutable.List[E]

  override def empty(): Stack = ???

  override def cons(elem: E, stack: Stack): Stack = ???

  override def tail(stack: Stack): Stack = ???

  override def isEmpty(stack: Stack): Boolean = ???

  override def head(stack: Stack): E = ???
}

