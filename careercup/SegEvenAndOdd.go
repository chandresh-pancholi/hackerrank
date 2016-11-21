package main

import "fmt"

func main() {
	var input []int = []int{12, 34, 45, 9, 8, 90, 3}
	var len int = len(input)

	left := 0
	right := len - 1

	for left < right {
		for input[left] % 2 == 0  {
			left++
		}
		for input[right] % 2 == 1  {
			right--
		}
		if left < right {
			temp := input[right]
			input[right] = input[left]
			input[left] = temp
		}
	}

	for i := 0; i < len ; i++  {
		fmt.Print(input[i], " ")
	}

}