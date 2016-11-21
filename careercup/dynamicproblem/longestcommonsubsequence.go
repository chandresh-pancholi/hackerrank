package main

import (
	"fmt"
	"math"
)

func main()  {
	var X string = "AGGTAB"
	var Y string = "GXTXAYB"
	
	var m int = len(X)
	var n int = len(Y)
	
	lcs := make([][]int, m+1)
	for i := range lcs {
		lcs[i] = make([]int, n+1)
	}

	for i := 0; i <= m; i++  {
		for j := 0; j <= n; j++  {
			if i == 0 || j == 0 {
				lcs[i][j] = 0
			} else if X[i-1] == Y[j-1] {
				lcs[i][j] = lcs[i-1][j-1]+1
			}else {
				lcs[i][j] = int(math.Max(float64(lcs[i-1][j]), float64(lcs[i][j-1])))
			}
		}
	}
	fmt.Println(lcs[m][n])
}

