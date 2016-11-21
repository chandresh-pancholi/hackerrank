package main

import (
	"fmt"
	"math"
)

func main() {
	var input []int = []int {1, -2, -3, 0, 7, -8, -2}
	var len int = len(input)

	var max_ending_here int = 1
	var min_ending_here int = 1
	var max_so_far int = 1

	for i := 0; i < len ;i++  {
		if input[i] > 0 {
			max_ending_here = max_ending_here * input[i]
			min_ending_here = int(math.Min(float64(min_ending_here * input[i]), 1))
		} else if input[i] == 0 {
			min_ending_here = 1
			max_ending_here = 1
		} else {
			var temp int  = max_ending_here
			max_ending_here = int(math.Max(float64(min_ending_here * input[i]), 1))
			min_ending_here = temp * input[i]
		}
		if max_so_far < max_ending_here {
			 max_so_far = max_ending_here
		}
	}

	fmt.Print(max_so_far)
}
