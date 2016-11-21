package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 101, 2, 3, 100, 4, 5}
	var len int = len(input)

	mis := make([]int, len)

	for i := 0; i < len ;i++  {
		mis[i] = input[i]
	}

	for i := 1; i < len ;i++  {
		for j := 0; j < i ;j++  {
			if input[i] > input[j] && mis[i] < mis[j] + input[i] {
				mis[i] = mis[j] + input[i]
			}
		}
	}

	max := 0
	for i := 0; i < len ;i++  {
		if max < mis[i] {
			max = mis[i]
		}
	}

	fmt.Println(max)
}

