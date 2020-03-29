package com.pawelzabczynski.sorting

trait Ordering[T <: Product] {
  def <(that: T): Boolean
  def >(that: T): Boolean
  def ===(that: T): Boolean
}
