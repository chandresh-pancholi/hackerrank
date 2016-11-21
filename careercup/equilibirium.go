package main

import "fmt"

func main()  {
	var input []int = []int{-7, 1, 5, 2, -4, 3, 0}
	var len int = len(input)

	var sum int = 0
	for i := 0; i < len ; i++  {
		sum += input[i]
	}

	var leftsum int = 0

	for i := 0; i < len ; i++  {
		sum -= input[i]
		if sum == leftsum {
			fmt.Print(i, " ")
			break
		}
		leftsum += input[i]
	}
	fmt.Println()
	fmt.Print("no equilibirum found")
}