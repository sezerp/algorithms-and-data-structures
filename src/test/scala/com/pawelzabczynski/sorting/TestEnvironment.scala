package com.pawelzabczynski.sorting

case class TestEntity() extends Ordering[TestEntity] {
  override def <(that: TestEntity): Boolean = true

  override def >(that: TestEntity): Boolean = false

  override def ===(that: TestEntity): Boolean = false
}

case class Number(value: Long) extends Ordering[Number] {
  override def <(that: Number): Boolean = value < that.value

  override def >(that: Number): Boolean = value > that.value

  override def ===(that: Number): Boolean = value == that.value
}

trait TestEnvironment {
  def unsortedNumberList: List[Number] = List(Number(2L), Number(11L), Number(5L), Number(1L), Number(9L),Number(3L))
  def sortedNumberList: List[Number] = List(Number(1L), Number(2L), Number(3L), Number(5L), Number(9L), Number(11L))

  def unsortedEntityList: List[TestEntity] = List.empty[TestEntity]
  def sortedEntityList: List[TestEntity] = List.empty[TestEntity]
}
