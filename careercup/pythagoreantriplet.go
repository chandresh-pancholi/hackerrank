package main

import (
	"fmt"
)

func main()  {
	var input []int =[]int {3, 1, 4, 6, 5}
	for i := 0; i < len(input) ;i++  {
		input[i] = input[i]*input[i]
	}

}

