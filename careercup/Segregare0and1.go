package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{0, 1, 0, 1, 1, 1,0}
	var left int = 0
	var right int = len(input) - 1

	for left < right  {
		for input[right] == 1  {
			right--
		}
		for input[left] == 0  {
			left++
		}
		if left < right {
			var temp int = input[right]
			input[right] = input[left]
			input[left] = temp
			left++
			right--
		}
	}

	for i := 0; i < len(input) ; i++  {
		fmt.Print(input[i], " ")
	}
}

