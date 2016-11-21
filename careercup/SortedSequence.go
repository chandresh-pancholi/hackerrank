package main

import (
	"fmt"
)

func main() {
	var input []int = []int {12,11, 10, 5, 6, 2,30}

	var smaller [7]int
	var greater [7]int

	var len int =  len(input)
	var min int = 0
	var max int = 6

	smaller[0] = -1
	for i :=1 ; i < 7 ;i++  {
		if input[i] <= input[min] {
			min = i
			smaller[i] = -1
		}else {
			smaller[i] = min
		}

	}

	greater[len - 1] = -1
	for i := len-2; i >= 0 ;i--  {
		if input[i] >= input[max] {
			max = i
			greater[i] = -1
		} else {
			greater[i] = max
		}
	}


	for i := 0; i < len ;i++  {
		if smaller[i] != -1 && greater[i] != -1 {
			fmt.Print(input[smaller[i]], input[i], input[greater[i]])
		}
	}
}
