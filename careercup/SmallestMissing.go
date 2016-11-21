package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{0, 1, 2, 3, 4, 5, 6, 7, 10}
	fmt.Println(smallestMissing(input, 0, len(input)))
}

func smallestMissing(input []int, start int, end int) int  {
	if start > end {
		return end+1
	}
	if start != input[start] {
		 return start
	}

	mid := start + (end - start)/2
	if input[mid] > mid {
		return smallestMissing(input, start, mid+1)
	} else {
		return smallestMissing(input, mid+1, end)
	}



}

