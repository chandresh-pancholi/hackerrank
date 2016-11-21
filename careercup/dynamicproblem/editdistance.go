package main

import (
	"fmt"
	"math"
)

func main()  {
	var str1 string = "sunday"
	var str2 string = "saturday"

	var m int = len(str1)
	var n int = len(str2)

	mat := make([][]int, m+1)
	for i := range mat {
		mat[i] = make([]int, n+1)
	}

	for i := 0; i <= m ; i++  {
		for j := 0; j <= n ;j++  {
			if i == 0 {
				mat[i][j] = j
			} else if j == 0 {
				mat[i][j] = i
			} else if str1[i-1] == str2[j-1] {
				mat[i][j] = mat[i-1][j-1]
			} else {
				mat[i][j] = int(math.Min(float64(mat[i-1][j-1]), math.Min( float64(mat[i][j-1]), float64(mat[i-1][j])))) + 1
			}
		}
	}

	fmt.Print(mat[m][n])
}

