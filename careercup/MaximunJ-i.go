package main

import (
	"fmt"
	"math"
)

func main()  {
	var input []int = []int{34, 8, 10, 3, 2, 80, 30, 33, 1}
	var len int = len(input)

	var left [len]int
	var right [len]int

	left[0] = input[0]

	for i := 1; i < len ;i++  {
		left[i] = math.Min(left[i-1], input[i])
	}
	right[len - 1] = input[len - 1]

	for i := len-2; i >= 0 ; i--  {
		right[i] = math.Max(right[i + 1], input[i])
	}
	
	i := 0
	j := 0
	maxDiff := -1

	for i < len && j < len {
		if left[i] < right[j] {
			maxDiff = math.Max(maxDiff, j - i)
			j++
		} else {
			i++
		}
		
	}
	fmt.Println(maxDiff)
}

