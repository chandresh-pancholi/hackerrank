package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{2, 3, 10, 6, 4, 8, 1}
	var len int = len(input)
	diff := input[1] - input[0]
	min_element := input[0]

	for i := 1; i < len-1 ;i++  {
		if input[i] - min_element > diff {
			diff = input[i] - min_element
		}
		if(input[i] < min_element) {
			min_element = input[i]
		}
	}

	fmt.Println(diff)

}

