package main

import (
	"fmt"
)

func main()  {
	var input []int = []int {1, 1, 1, 1 }
	var len int = len(input)

	res := 1
	for i := 0; i < len && input[i] <= res; i++{
		res = res + input[i]
	}

	fmt.Println(res)
}

