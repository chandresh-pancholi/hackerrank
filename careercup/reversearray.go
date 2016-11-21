package main

import (
	"fmt"
)

func main() {
	var input []int = []int{1, 2, 3, 4, 5}
	var k int = len(input)-1
	for i := 0; i < len(input)/2 ;i++  {
		var temp int = input[k]
		input[k] = input[i]
		input[i] = temp
		k--
	}

	for i := 0; i < len(input) ;i++  {
		fmt.Print(input[i], " ")
	}
}
