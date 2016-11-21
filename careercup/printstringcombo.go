package main

import (
	"fmt"
)
func main() {
	var k int = 3
	var input string = "ABCDEFGH"
	var len int = len(input)
	data := make([]byte, k)

	pointCombo(input, data, 0, len-1, 0, k)
}

func pointCombo(input string, data []byte, start int, end int, index int, k int)  {

	if index == k {
		for i := 0; i < k ;i++  {
			fmt.Print(string(data[i]), " ")
		}
		fmt.Println()
		return
	}

	for i := start; i <= end && end - i + 1 >= k - index ;i++  {
		data[index] = input[i]
		pointCombo(input, data, i+1, end, index+1, k)
	}
}
