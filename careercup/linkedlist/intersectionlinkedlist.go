package main

import (
	"fmt"
)

type node struct {
	value int
	next *node
}

func main()  {
	var head *node = nil
	head = &node{value: 3}
	head.next = &node{value: 6}
	head.next.next = &node{value: 9}
	head.next.next.next = &node{value: 15}
	head.next.next.next.next = &node{value: 30}

	var head1 *node = nil
	head1 = &node{value: 10}
	head1.next = head.next.next.next

	var len1 int = 0
	var len2 int = 0

	temp := head
	temp1 := head1

	for temp != nil{
		len1++
		temp = temp.next
	}

	for temp1 != nil {
		len2++
		temp1 = temp1.next
	}
	if len1 > len2 {
		diff := len1 - len2
		getIntersectionNode(diff, head, head1)
	} else {
		diff := len2 - len1
		getIntersectionNode(diff, head1, head)
	}
}

func getIntersectionNode(diff int, head *node, head1 *node)  {
	var current1 *node = head
	var current2 *node = head1

	for diff > 0  {
		current1 = current1.next
		diff--
	}

	for current1 != nil && current2 != nil{
		if current1 == current2 {
			fmt.Println(current1.value)
			break;
		}
		current1 = current1.next
		current2 = current2.next
	}

}

