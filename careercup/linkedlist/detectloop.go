package main

import (
	"fmt"
)

type node struct {
	value int
	next *node
}

func main() {
	var head *node = nil

	head = &node{value : 1}
	head.next = &node{value: 2}
	head.next.next = &node{value: 8}
	head.next.next.next = &node{value: 3}
	head.next.next.next.next = &node{value: 4}
	head.next.next.next.next.next = head

	slow_ptr := head
	fast_ptr := head

	for fast_ptr != nil && fast_ptr.next != nil  && slow_ptr != nil{
		slow_ptr = slow_ptr.next
		fast_ptr = fast_ptr.next.next

		if slow_ptr == fast_ptr{
			fmt.Println("Loop detected")
			break
		}

	}

}
