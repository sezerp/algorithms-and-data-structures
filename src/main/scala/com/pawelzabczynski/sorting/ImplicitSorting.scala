package com.pawelzabczynski.sorting

import scala.annotation.tailrec

object ImplicitSorting {

  implicit class Sorting[T <: Ordering[T] with Product](in: List[T]) {

    def selectionSort(): List[T] = {
      @tailrec
      def findMin(acc: List[T], min: T, xs: List[T]): List[T] = {
        if (xs.isEmpty) min :: acc
        else if (min > xs.head) findMin(acc :+ min, xs.head, xs.tail)
        else findMin(acc :+ xs.head, min, xs.tail)
      }

      @tailrec
      def loop(acc: List[T], xs: List[T]): List[T] = {
        if (xs.isEmpty) acc
        else {
          val ys = findMin(List.empty[T], xs.head, xs.tail)
          loop(acc :+ ys.head, ys.tail)
        }
      }

      loop(List.empty[T], in)
    }

    def insertionSort(): List[T] = {
      in
    }
  }
}
