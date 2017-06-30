package org.busywait.purelyfunctionaldatastructures.sets

import org.busywait.purelyfunctionaldatastructures.Set
import org.busywait.purelyfunctionaldatastructures.collections.{BinaryTree, Empty, Tree}

/**
  * Created by Henrik Kirk on 02-06-2016.
  */
class UnbalancedSet[E](s: BinaryTree[E] = Empty)(implicit ord: Ordering[E]) extends Set[E] {
  override def empty(): Set[E] = new UnbalancedSet()

  /*
  override def member(element: E): Boolean = {
    def member(tree: BinaryTree[E]): Boolean = s match {
      case Empty => false
      case Tree(left, e, right) =>
        if (e.equals(element)) true
        else if (ord.lt(e, element)) member(right)
        else member(left)
    }

    member(s)
  }
  */
  // Exercice 2.2
  override def member(element: E): Boolean = {
    def member(tree: BinaryTree[E], last: Option[E]): Boolean = s match {
      case Empty => last.exists(e => ord.equiv(e, element))
      case Tree(left, e, right) =>
        if (ord.lt(e, element)) member(right, last)
        else member(left, Some(e))
    }

    member(s, None)
  }

  /*
  override def insert(element: E): Set[E] = {
    def insert(tree: BinaryTree[E]): BinaryTree[E] = tree match {
      case Empty => Tree(Empty, element, Empty)
      case Tree(left, e, right) =>
        if (element == e) tree
        else if (ord.lt(element, e)) Tree(left, e, insert(right))
        else Tree(insert(left), e, right)
    }
    new UnbalancedSet(insert(s))
  }
  */

  // 2.3
  override def insert(element: E): Set[E] = {
    def insert(tree: BinaryTree[E]): BinaryTree[E] = tree match {
      case Empty => Tree(Empty, element, Empty)
      case Tree(left, e, right) =>
        if (element == e) tree
        else if (ord.lt(element, e)) Tree(left, e, insert(right))
        else Tree(insert(left), e, right)
    }
    new UnbalancedSet(insert(s))
  }
}