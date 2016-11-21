package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 4, 20, 3, 10, 5}
	var len int = len(input)
	var sum int = 33

	var curr_sum int = input[0]
	var start int = 0

	for i := 1; i <=len ; i++  {
		for curr_sum > sum && start < i -1  {
			curr_sum -= input[start]
			start++
		}

		if sum == curr_sum {
			fmt.Print(start, i-1, " ")
		}

		if i < len {
			curr_sum += input[i]
		}
	}
}

