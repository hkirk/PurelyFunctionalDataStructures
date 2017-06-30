package org.busywait.purelyfunctionaldatastructures

/**
  * Created by Henrik Kirk on 01-06-2016.
  */
trait Set[E] {
  def empty(): Set[E]
  def insert(element: E): Set[E]
  def member(element: E): Boolean
}
