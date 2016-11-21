package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{3, 1, 5, 9, 12}
	var len int = len(input)

	var sum int = 0
	for i := 0; i < len ;i++  {
		sum += input[i]
	}

	fmt.Println(isPartition(input, len, sum))

}

func isPartition(input []int, len int, sum int) bool  {
	if sum % 2 != 0 {
		return false
	}
	part := make([][]bool, sum/2 + 1)
	for i := range part {
		part[i] = make([]bool, len+1)
	}

	for i := 0; i < len+1 ;i++  {
		part[0][i] = true
	}

	for i := 0; i < len+1 ;i++  {
		part[i][0] = false
	}

	for i := 1; i < sum/2+1 ;i++  {
		for j :=1 ;j < len+1 ;j++  {

			part[i][j] = part[i][j-1]

			if i >= input[j-1] {
				part[i][j] = part[i][j] || part[i - input[j-1]][j-1]
			}
		}
	}

	return part[sum/2][len]
}
