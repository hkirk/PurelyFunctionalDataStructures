package org.busywait.purelyfunctionaldatastructures.collections

/**
  * Created by Henrik Kirk on 02-06-2016.
  */
sealed trait BinaryTree[+E] {
}

case object Empty extends BinaryTree[Nothing] {
  override def toString: String = "Empty"
}

case class Tree[E](left: BinaryTree[E], element: E, right: BinaryTree[E]) extends BinaryTree[E] {
  override def toString: String = "Tree(%s, %s, %s)".format(left, element, right)
}
