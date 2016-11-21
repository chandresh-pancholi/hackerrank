package main

import (
	"fmt"
	"math"
)

func main()  {
	var input string = "GEEKS FOR GEEKS"
	var m int = len(input)

	result := make([][]int, m)
	for i := range result {
		result[i] = make([]int, m)
	}

	for i := 0; i < m ;i++  {
		result[i][i] = 1
	}
	for cl := 2; cl <= m ;cl++  {
		for i := 0; i < m - cl + 1 ;i++  {
			j := i + cl - 1
			if input[i] == input[j] &&  cl == 2{
				result[i][j] = 2
			} else if input[i] == input[j] {
				result[i][j] = result[i+1][j-1] + 2
			} else {
				result[i][j] = int(math.Max(float64(result[i+1][j]), float64(result[i][j-1])))
			}
		}
	}

	fmt.Println(result[0][m-1])
}
