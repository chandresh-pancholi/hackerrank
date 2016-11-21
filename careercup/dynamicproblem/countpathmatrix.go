package main

import (
	"fmt"
)

func main()  {
	m := 3
	n := 3

	fmt.Println(countPath(m, n))
}

func countPath(m int, n int) int  {
	count := make([][]int, m )
	for i := range count{
		count[i] = make([]int, n)
	}
	for i := 0 ; i < m ;i++  {
		count[i][0] = 1
	}
	for i := 0; i < n ;i++  {
		count[0][i]  = 1
	}

	for i := 1; i < m ;i++  {
		for j := 1 ; j < n; j++{
			count[i][j] = count[i-1][j] + count[i][j-1]
		}
	}

	return count[m-1][n-1]


}
