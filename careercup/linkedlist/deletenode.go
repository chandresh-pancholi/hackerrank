package main

import "fmt"

type node struct {
	value int
	next *node
}

func main() {
	var head *node = nil

	head = &node{value: 1}
	head.next = &node{value: 2}
	head.next.next = &node{value:3}

	deleteNode(head)
	fmt.Println(head.value)
	fmt.Println(head.next.value)

}

func deleteNode(head *node)  {
	var temp *node = head.next
	head.value = temp.value
	head.next = temp.next
	temp = nil
}