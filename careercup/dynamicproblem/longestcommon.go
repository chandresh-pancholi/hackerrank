package main

import (
	"fmt"
	"math"
)

func main()  {
	var X string = "OldSite:GeeksforGeeks.org"
	var Y string = "NewSite:GeeksQuiz.com"

	var m int = len(X)
	var n int = len(Y)

	lcs := make([][]int, m + 1)
	for i := range lcs  {
		lcs[i] = make([]int, n + 1)
	}
	result := -1
	for i := 0; i <= m ;i++  {
		for j := 0; j <= n ;j++  {
			if i == 0 || j == 0 {
				lcs[i][j] = 0
			} else if X[i-1] == Y[j-1] {
				lcs[i][j] = lcs[i-1][j-1] + 1
				result = int(math.Max(float64(result), float64(lcs[i][j])))
			} else {
				lcs[i][j] = 0
			}
		}
	}

	fmt.Println(result)
}

