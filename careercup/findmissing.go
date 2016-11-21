package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{9, 6, 900, 850, 5, 90, 100, 99}
	output := make([]int, 100)

	for i := 0; i < len(input) ;i++  {
		if input[i] <= 99 {
			output[input[i]] = 1
		}

	}
	for i := 0; i < len(output) ;i++  {
		if output[i] == 0 {
			fmt.Print(i, " ")
		}
	}
}

