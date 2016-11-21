package main

import (
	"fmt"
	"math"
)
/*
Remove minimum elements from either side such that 2*min becomes more than max
 */
func main()  {
	var input []int = []int{4, 5, 100, 9, 10, 11, 12, 15, 200}
	var len int = len(input)

	longest_start := -1
	longest_end := 0

	for start := 0; start < len ; start++  {
		max := math.MinInt64
		min := math.MaxInt64

		for end := start; end < len ;end++  {
			val := input[end]
			min = int(math.Min( float64(min), float64(val)))
			max = int(math.Max( float64(max), float64(val)))

			if 2 * min <= max {
				break
			}
			if end - start > longest_end - longest_start || longest_start == -1{
				longest_end = end
				longest_start = start
			}
		}
	}

	if longest_start == -1 {
		fmt.Println(len)
	} else {
		fmt.Println(len - (longest_end - longest_start + 1))
	}
}

