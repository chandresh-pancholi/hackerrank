package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{1, 2, 3}
	var m int = len(input)

	var n int = 4

	table := make([][]int, n+1)
	for i := range table {
		table[i] = make([]int , m)
	}

	for i := 0; i < m ;i++  {
		table[0][i] = 1
	}

	for i := 1; i < n+1 ;i++  {
		for j := 0; j < m ; j++  {
			x := 0
			if i - input[j] >= 0 {
				x = table[i - input[j]][j]
			} else {
				x = 0
			}

			y := 0
			if j >= 1 {
				y = table[i][j-1]
			} else {
				y = 0
			}

			table[i][j] = x + y
		}
	}
	fmt.Println(table[n][m-1])
}

