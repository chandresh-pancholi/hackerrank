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
	head.next.next.next = &node{value: 2}
	head.next.next.next.next = &node{value: 1}
	//head.next.next.next.next.next = &node{value: 1}
	
	fmt.Println(isPalindrome(&head, head))
}

func isPalindrome( left **node, right *node ) bool  {
	if right == nil {
		return true
	}

	isPal := isPalindrome(left, right.next)
	if isPal == false {
		return false;
	}

	if *left.value == right.value {
		isPal = true
	}
	*left = *left.next
	return isPal
}

