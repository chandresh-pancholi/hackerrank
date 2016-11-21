package main

import (
	"fmt"
)

func main() {
	var input[] int =[]int {1, 2, 3, 2, 3, 1, 3,3,1}
	var x int = input[0]
	for i := 1; i < len(input) ; i++ {
		x = x^input[i]
	}

	fmt.Println(x)

}
