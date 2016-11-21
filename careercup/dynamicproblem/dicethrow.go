package main

import (
	"fmt"
)

func main()  {
	var m int = 2
	var n int = 2
	var x int = 3

	fmt.Println(findWays(m, n, x))
}

func findWays(m int, n int, x int) int  {
	table := make([][]int, n+1)
	for i := range table{
		table[i] = make([]int, x + 1)
	}

	for i := 1; i <= m && i <= x;  i++{
		table[1][i] = 1
	}

	for i := 2; i <= n ;i++ {
		for j := 1; j <= x; j++ {
			for k := 1; k <= m && k < j; k++ {
				table[i][j] += table[i-1][j-k]
			}
		}
	}

	return table[n][x]
}
