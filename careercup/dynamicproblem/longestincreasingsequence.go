package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{10, 22, 9, 33, 21, 50, 41, 60 }
	var len int = len(input)
	
	lis := make([]int, len)

	for i := 0; i < len; i++  {
		lis[i] = 1
	}

	for i := 1; i < len; i++  {
		for j := 0; j < i ;j++  {
			if input[i] > input[j] && lis[i] < lis[j] + 1 {
				lis[i] = lis[j] + 1
			}
		}
	}

	max := 0
	for i := 0; i < len ;i++  {
		if max < lis[i] {
			max = lis[i]
		}
	}
	fmt.Println(max)
}

