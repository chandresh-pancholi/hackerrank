package main

import (
	"fmt"
)

type node struct {
	value int
	next *node
	random *node
}

func main()  {
	var head *node = nil
	head = &node{value: 1}
	head.next = &node{value: 2}
	head.next.next = &node{value: 3}
	head.next.next.next = &node{value: 4}

	head.random = head.next.next
	head.next.random = head.next.next

	hm := make(map[*node]*node)

	original := head
	var clone *node = nil

	for original != nil  {
		clone = &node{value: original.value }
		hm[original] = clone
		original = original.next
	}
	original = head
	for original != nil{
		clone = hm[original]
		clone.next = hm[original.next]
		clone.random = hm[original.random]

		original = original.next
		fmt.Print(clone.value, " ")
	}



}

