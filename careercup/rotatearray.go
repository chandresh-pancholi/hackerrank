package main

import (
	"fmt"
)

func main()  {
	var input []int = []int {1, 2, 3, 4, 5, 6, 7,8}
	var d int = 2
	var k int = d-1
	for i := 0; i < d/2; i++ {
		var temp int = input[k]
		input[k] = input[i]
		input[i] = temp
		k--
	}

	//for i := 0; i < d; i++ {
	//	fmt.Println(input[i], " ")
	//}

	k = len(input) - 1
	fmt.Println(d)
	for i := d; i <= len(input)-d  ; i++  {
		var temp int = input[k]
		input[k] = input[i]
		input[i] = temp
		k--
	}
	k = len(input) - 1
	for i := 0; i < len(input)/2 ;i++  {
		var temp int = input[k]
		input[k] = input[i]
		input[i] = temp
		k--
	}
	for i := 0; i < len(input); i++ {
		fmt.Print(input[i], " ")
	}
}

