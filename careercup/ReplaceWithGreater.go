package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{16, 17, 4, 3, 5, 2}
	var len int = len(input)


	var max int = input[len-1]
	input[len-1] = - 1
	for i := len-2; i >=0 ;i--  {
		if input[i] > max {
			var temp int = input[i]
			input[i] = max
			max = temp
		}else{
			input[i] = max
		}
	}

	for i := 0; i < len ;i++  {
		fmt.Print(input[i], " ")
	}
}

