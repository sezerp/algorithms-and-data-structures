val xs: List[Long] = List(4,2,3,1,5)

List(99, 100) :+ 1
1 :: List(99, 100)

List(xs.head).foldLeft(xs.tail) { (acc, x) =>
    if(x < acc.head) (x :: acc)
    else            (acc.head :: x :: acc.tail)
}


def findMin[T <: Long](acc: List[T], min: T, xs: List[T]): List[T] = {
  if (xs.isEmpty) min :: acc
  else if (min > xs.head) findMin(acc :+ min, xs.head, xs.tail)
  else findMin(acc :+ xs.head, min, xs.tail)
}

val r = findMin[Long](Nil, xs.head, xs.tail)
val r2 = findMin[Long](Nil, r.tail.head, r.tail.tail)
val r3 = findMin[Long](Nil, r2.tail.head, r2.tail.tail)
val r4 = findMin[Long](Nil, r3.tail.head, r3.tail.tail)
val r5 = findMin[Long](Nil, r4.tail.head, r4.tail.tail)

val ys = List(1)

ys.head
ys.tail