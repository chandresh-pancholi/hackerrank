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
	head.next = &node{value: 4}
	head.next.next = &node{value: 7}
	head.next.next.next = &node{value: 9}

	var k int = 5

	var temp *node = &node{value: k}

	if head == nil{
		head = temp
	}
	if head != nil && temp.value <= head.value{
		temp.next = head
		head = temp
	} else {
		temp2 := head
		for temp2.next != nil{
			if temp2.next.value >= temp.value {
				temp.next = temp2.next
				temp2.next = temp
				break;
			}
			temp2 = temp2.next
		}
	}

	temp = head
	for temp != nil {
		fmt.Print(temp.value, " ")
		temp = temp.next
	}

}

