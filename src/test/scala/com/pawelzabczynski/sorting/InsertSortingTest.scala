package com.pawelzabczynski.sorting

import com.pawelzabczynski.sorting.ImplicitSorting._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class InsertSortingTest extends AnyFlatSpec  with TestEnvironment {

  it should "sort given collection using selection sort method" in {
    val result = unsortedNumberList.selectionSort()
    result should equal (sortedNumberList)
  }

  it should "sort given collection using insert sort method" in {
    val result = unsortedNumberList.insertionSort()
    result should equal (sortedNumberList)
  }

  it should "sort given collection using bobble sort method" in {
    val result = unsortedNumberList.selectionSort()
    result should equal (sortedNumberList)
  }

  it should "sort given collection using quick sort method" in {
    val result = unsortedNumberList.selectionSort()
    result should equal (sortedNumberList)
  }

  it should "sort given collection using merge sort method" in {
    val result = unsortedNumberList.selectionSort()
    result should equal (sortedNumberList)
  }
}
