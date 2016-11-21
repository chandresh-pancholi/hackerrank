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
	head.next = &node{value: 2}
	head.next.next = &node{value: 3}
	head.next.next.next = &node{value: 4}

	reverse(head)

}

func reverse(head *node)  {
	if head == nil{
		return
	}
	reverse(head.next)
	fmt.Print(head.value, " ")
}
