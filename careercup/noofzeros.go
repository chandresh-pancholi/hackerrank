package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 1, 0, 0, 0, 0, 0, 0}
	var len int = len(input)

	low := 0
	high := len-1

	zeroIndex := 0
	for low <= high  {
		mid := low + (high - low)/2

		if input[mid] == 0 && input[mid - 1] == 1 {
			zeroIndex = mid
			break
		} else if input[mid] == 1 {
			low = mid + 1
		} else {
			high = mid - 1
		}
	}

	fmt.Println(len - zeroIndex)
}

