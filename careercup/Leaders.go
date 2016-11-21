package main

import "fmt"

func main()  {
	var input []int = []int{16, 17, 4, 3, 5, 2}
	var max int = input[len(input) - 1]
	fmt.Print(max, " ")
	for i := len(input) - 2; i >= 0 ; i--  {
		if max < input[i] {
			max = input[i]
			fmt.Print(max, " ")
		}
	}
}