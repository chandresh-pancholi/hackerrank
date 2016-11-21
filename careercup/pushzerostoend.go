package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}
	var len  int = len(input)

	var count int = 0

	for i := 0; i < len ;i++  {
		if input[i] != 0 {
			input[count] = input[i]
			count++
		}
	}

	for count < len{
		input[count] = 0
		count++
	}

	for  i := 0 ; i < len ; i++  {
		fmt.Print(input[i], " ")
	}
}

