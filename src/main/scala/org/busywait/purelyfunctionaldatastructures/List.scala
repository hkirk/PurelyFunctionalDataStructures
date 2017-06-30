package org.busywait.purelyfunctionaldatastructures

import scala.collection.immutable

/**
  * Created by Henrik Kirk on 27-05-2016.
  */
class List[E] extends AStack[E] {
  type Stack = immutable.List[E]

  override def empty(): Stack = immutable.Nil
  override def isEmpty(stack: Stack): Boolean = stack.isEmpty

  override def cons(elem: E, stack: Stack): Stack = elem :: stack
  override def tail(stack: Stack): Stack = stack.tail
  override def head(stack: Stack): E = stack.head
}
