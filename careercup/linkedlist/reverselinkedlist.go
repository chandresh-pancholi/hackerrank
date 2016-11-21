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

	head = &node{value : 1}
	head.next = &node{value: 2}
	head.next.next= &node{value: 3}
	head.next.next.next = &node{value: 4}
	head.next.next.next.next = &node{value: 5}

	var prev *node = nil
	var current *node = head
	var temp *node = nil
	for current != nil {
		temp = current.next
		current.next = prev
		prev = current
		current = temp

	}
	head = prev
	temp = head

	for temp != nil {
		fmt.Print(temp.value, " ")
		temp = temp.next
	}
}

