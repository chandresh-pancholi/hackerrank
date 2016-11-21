package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{3, 2, 0, 1}
	var len int = len(input)

	for i := 0;i<len ;i++  {
		input[i] += len * (input[input[i]] % len)
		fmt.Print(input[i], " ")
 	}

	fmt.Println()

	for i := 0; i < len ; i++  {
		input[i] /= len
		fmt.Print(input[i], " ")
	}
}

