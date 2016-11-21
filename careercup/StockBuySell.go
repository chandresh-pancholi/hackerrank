package main

import (
	"fmt"
)

type interval struct {
	buy int
	sell int
}

func main() {
	var input []int = []int{100, 180, 260, 310, 40, 535, 695}
	var len int = len(input)

	var solution [3]interval

	i := 0
	count := 0
	for i < len-1  {
		for i < len && input[i+1] <= input[i] {
			i++
		}
		if i == len - 1 {
			break
		}
		solution[count].buy = input[i]

		i = i + 1
		for i < len && input[i] >= input[i-1]  {
			i++
		}
		solution[count].sell = input[i - 1]
		count++
		fmt.Println(i)
	}
	if count == 0{
		 fmt.Println(" Don't buy anything today ")
	} else {
		for j := 0; j < 3; j++  {
			fmt.Println(solution[j].buy, solution[j].sell)
		}

	}
}
