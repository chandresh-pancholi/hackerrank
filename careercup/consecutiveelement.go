package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 4, 5, 3, 2,7}

	fmt.Print(isConsecutive(input))
}

func isConsecutive(input []int) bool  {
	min := getMin(input)
	max := getMax(input)

	if max - min + 1 == len(input){
		for i := 0; i < len(input) ;i++  {
			var j int

			if input[i] < 0 {
				j = -input[i] - min
			} else {
				j = input[i] - min
			}

			if input[j] > 0 {
				input[j] = -input[j]
			} else {
				return false
			}
		}
		return true
	} else {
		return false
	}
}
func getMin(input []int ) int  {
	min := input[0]
	for i := 1; i < len(input) ;i++  {
		if min > input[i] {
			min = input[i]
		}
	}
	return min
}

func getMax(input []int) int  {
	max := input[0]
	for i :=1; i< len(input) ;i++  {
		if max < input[i] {
			max = input[i]
		}
	}
	return max
}