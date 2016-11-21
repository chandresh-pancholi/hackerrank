package main

import "fmt"

type node struct {
	value int
	next *node
}

func main()  {
	var head *node = nil
	head = &node{value : 1}
	head.next = &node{value : 2}
	head.next.next = &node{value: 3}
	head.next.next.next = &node{value: 4}
	head.next.next.next.next = &node{value : 5}
	//head.next.next.next.next.next = &node{value: 6}

	var slow *node = head
	var fast *node = head
	if head != nil{
		for fast != nil && fast.next != nil {
			fast = fast.next.next
			slow = slow.next
		}
		fmt.Println(slow.value)
	}

}
