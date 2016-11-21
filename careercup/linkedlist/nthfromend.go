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
	head.next = &node{value : 2}
	head.next.next = &node{value: 3}
	head.next.next.next = &node{value: 4}
	head.next.next.next.next = &node{value : 5}
	head.next.next.next.next.next = &node{value: 6}
	head.next.next.next.next.next.next = &node{value: 7}

	var n int = 4

	var ref_ptr *node = head
	var main_ptr *node = head

	if head != nil {
		for n > 0  {
			ref_ptr = ref_ptr.next
			n--
		}
	}

	for ref_ptr != nil {
		ref_ptr = ref_ptr.next
		main_ptr = main_ptr.next
	}

	fmt.Println(main_ptr.value)

}

