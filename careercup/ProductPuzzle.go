package main

import "fmt"

func main()  {
	var input []int = []int {10, 3, 5, 6, 2}
	var len int = len(input)
	left := make([]int, len)
	right := make([]int, len)

	left[0] = 1
	for i := 1; i < len ; i++  {
		left[i] = left[i-1] * input[i-1]
	}
	right[len-1] = 1
	for i := len-2; i>=0 ;i--  {
		right[i] = right[i+1]*input[i+1]
	}

	for i := 0; i < len ;i++  {
		input[i] = left[i]*right[i]
		fmt.Print(input[i], " ")
	}


}
