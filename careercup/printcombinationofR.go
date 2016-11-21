package main

/*
Print all possible combinations of r elements in a given array of size n
 */

import (
	"fmt"
)
func main() {
	var r int = 3
	var input string = "ABCDEFGH"
	var len int = len(input)
	data := make([]byte, r)

	pointCombo(input, data, 0, len-1, 0, r)
}

func pointCombo(input string, data []byte, start int, end int, index int, r int)  {

	if index == r {
		for i := 0; i < r ;i++  {
			fmt.Print(string(data[i]), " ")
		}
		fmt.Println()
		return
	}

	for i := start; i <= end && end-i+1 >= r-index ;i++  {
		data[index] = input[i]
		pointCombo(input, data, i+1, end, index+1, r)
	}
}
