package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{4, 2, 4, 5, 2, 3, 3, 1}
	var len int = len(input)

	var set_bit int
	var xor int = input[0]
	for i := 1; i < len ; i++  {
		xor^=input[i]
	}
	set_bit = xor &^ (xor-1)
	var x int
	var y int
	for i := 0; i < len ;i++  {
		if input[i] & set_bit {
			x = x ^ input[i]
		}else {
			y = y ^ input[i]
		}

	}
	fmt.Println(x,y)



}

