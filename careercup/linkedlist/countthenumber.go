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
	head = &node{value: 1}
	head.next = &node{value : 2}
	head.next.next = &node{value: 3}
	head.next.next.next = &node{value: 4}
	head.next.next.next.next = &node{value : 4}
	head.next.next.next.next.next = &node{value: 4}
	head.next.next.next.next.next.next = &node{value: 7}

	var count int = 0
	var k int = 4

	var temp *node = head

	if head != nil{
		for temp != nil {
			if temp.value == k {
				count++
			}
			temp = temp.next
		}
	}
	fmt.Println(count)
}

