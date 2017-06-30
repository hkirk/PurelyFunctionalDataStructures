package org.busywait.purelyfunctionaldatastructures

/**
  * Created by Henrik Kirk on 30-05-2016.
  */
class CustomStack[E] extends AStack[E] {
  type Stack = AList[E]

  override def empty(): Stack = Nil[E]
  override def isEmpty(stack: Stack): Boolean = stack match {
    case Nil => true
    case _ => false
  }

  override def cons(elem: E, stack: Stack): Stack = Cons(elem, stack)
  override def tail(stack: Stack): Stack = stack match {
    case Cons(head, tail) => tail
    case _ => throw new IllegalArgumentException("Tail do not exists on empty")
  }
  override def head(stack: Stack): E = stack match {
    case Cons(head, tail) => head
    case _ => throw new IllegalArgumentException("Head do not exists on empty")
  }

  // Exercise 2.1
  def suffixes(stack: Stack): Stack = stack match {
    case Nil => Cons(Nil)
    case Cons(head, tail) => Cons(stack, suffixes(tail))
  }
}

case class AList[E]()
case class Cons[E](head: E, tail: AList[E]) extends AList[E]
case object Nil extends AList[Nothing]
