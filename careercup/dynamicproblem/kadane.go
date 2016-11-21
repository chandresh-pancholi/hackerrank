package main

import (
	"math"
	"fmt"
)

func main()  {
	var input []int = []int{-2, -3, 4, -1, -2, 1, 5, -3}
	var len int = len(input)
	
	curr_max := input[0]
	max_so_far := input[0]

	for i := 1; i < len; i++ {
		curr_max = int(math.Max(float64(input[i]), float64(curr_max + input[i])))
		max_so_far = int(math.Max(float64(curr_max), float64(max_so_far)))
	}

	fmt.Print(max_so_far)
}
