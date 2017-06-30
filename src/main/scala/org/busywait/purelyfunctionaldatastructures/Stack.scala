package org.busywait.purelyfunctionaldatastructures

/**
  * Created by Henrik Kirk on 27-05-2016.
  */
trait AStack[E] {
  type Stack
  def empty(): Stack
  def isEmpty(stack: Stack): Boolean

  def cons(elem: E, stack: Stack): Stack
  def head(stack: Stack): E
  def tail(stack: Stack): Stack
}

