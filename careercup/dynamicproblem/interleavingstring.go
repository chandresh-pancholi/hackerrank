package main

import (
	"fmt"
)

func main()  {
	var A string = "XXY"
	var B string = "XXZ"
	var C string = "XXZXXXY"

	fmt.Println(isInterleave(A, B, C))
}

func isInterleave(A, B, C string) bool  {
	m := len(A)
	n := len(B)

	interleave := make([][]bool, m + 1 )
	for i := range interleave{
		interleave[i] = make([]bool, n+1)
	}

	if m + n != len(C) {
		return false
	}

	for i := 0; i <= m ;i++  {
		for j := 0; j <= n; j++ {
			if i == 0 && j == 0 {
				interleave[i][j] = true
			}else  if j == 0 && A[i-1] == C[i-1] {
				interleave[i][j] = interleave[i-1][j]
			} else if i == 0 && B[j-1] == C[j-1] {
				interleave[i][j] = interleave[i][j-1]
			} else if A[i-1] == C[i+j-1] && B[j-1] != C[i+j-1] {
				interleave[i][j] = interleave[i-1][j]
			} else if B[j-1] == C[i+j-1] && A[i-1] != C[i+j-1] {
				interleave[i][j] = interleave[i][j-1]
			} else if A[i-1] == C[i+j-1] && B[j-1] == C[i+j-1] {
				interleave[i][j] = interleave[i-1][j] || interleave[i][j-1]
			}
				

		}
	}

	return interleave[m][n]
}
