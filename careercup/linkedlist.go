package main

import "fmt"

type node struct {
	data int
	next *node
}
func main()  {
	var head *node = nil

	head = &node{data: 5}
	head.next = &node{data: 6}
	head.next.next = &node{data: 7}
	head.next.next.next = &node{data: 8}

	getNth(head, 2)



}

func getNth(head *node, n int)  {
	var temp *node = head
	n--
	for temp != nil && n > 0 {

		temp = temp.next
		n--;
	}
	fmt.Println(temp.data)


}
