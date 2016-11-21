package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{3, 2, 2, 5}
	var len int = len(input)

	var M int = 6

	extras := make([][]int, len + 1)
	for i := range extras{
		extras[i] = make([]int, len+1)
	}

	lc := make([][]int, len + 1)
	for i := range lc {
		lc[i] = make([]int, len+1)
	}

	cost := make([]int, len + 1)

	for i := 1; i <= len ;i++  {
		extras[i][i] = M - input[i-1]
		for j := i+1; j <= len ;j++  {
			extras[i][j] = extras[i][j-1] - input[j-1] - 1
 		}
	}
	for i := 1; i <= len ; i++  {
		for j := i; j <= len ;j++  {
			if extras[i][j] < 0 {
				lc[i][j] = 2334455565656
			} else if j == len && extras[i][j] >= 0 {
				lc[i][j] = 0
			} else {
				lc[i][j] = extras[i][j] * extras[i][j]
			}
			fmt.Print(lc[i][j], " ")
		}
		fmt.Println()
	}
	cost[0] = 0
	for j := 1; j <= len ;j++  {
		cost[j] = 2334455565656

		for i := 1; i <= j ;i++  {
			if cost[i-1] != 2334455565656 && lc[i][j] != 2334455565656 && cost[i-1] + lc[i][j] < cost[j] {
				cost[j] = cost[i-1] + lc[i][j]
			}	
		}
	}
	for i := 0; i <= len ;i++  {
		fmt.Print(cost[i], " ")
	}
}

