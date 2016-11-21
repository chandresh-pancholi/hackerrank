package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 4, 45, 6, 0, 19}
	var len int = len(input)
	var x int = 51

	start := 0
	end := 0
	curr_sum := 0
	min := len + 1
	for end < len  {
		for curr_sum <= x && end < len  {
			curr_sum += input[end]
			end++
		}

		for curr_sum > x && start < len  {
			if end - start < min {
				min = end - start
			}
			curr_sum -= input[start]
			start++
		}
	}

	fmt.Println(min)
}
