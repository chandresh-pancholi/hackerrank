package main

import (
	"fmt"
	"math"
)

func main()  {
	var input [][]int = [][]int{{0, 1, 1, 0, 1},
		{1, 1, 0, 1, 0},
		{0, 1, 1, 1, 0},
		{1, 1, 1, 1, 0},
		{1, 1, 1, 1, 1},
		{0, 0, 0, 0, 0}};
	var m int = len(input)
	var n int = len(input[0])


	sol := make([][]int, m)
	for i := range sol {
		sol[i] = make([]int, n)
	}
	for i := 0; i < n ;i++  {
		sol[0][i] = input[0][i]
	}
	for i := 0; i < m ;i++  {
		sol[i][0] = input[i][0]
	}
	for i := 1; i < m ;i++  {
		for j := 1; j < n ;j++  {
			if input[i][j] == 1 {
				sol[i][j] = int(math.Max(float64(input[i-1][j-1]),math.Max(float64(input[i-1][j]), float64(input[i][j-1])))) + 1
			} else {
				sol[i][j] = 0
			}
		}
	}

	max_of_s := sol[0][0]
	max_i := 0
	max_j := 0

	for i := 0; i < m ;i++  {
		for j := 0; j < n ;j++  {
			fmt.Print(sol[i][j], " ")
			if max_of_s <= sol[i][j] {
				max_of_s = sol[i][j]
				max_i = i
				max_j = j
			}
		}
		fmt.Println()
	}
	fmt.Println(max_of_s, max_i, max_j)
	for i := max_i; i > max_i - max_of_s; i--  {
		for j := max_j; j > max_j - max_of_s; j--  {
			fmt.Print(input[i][j], " ")
		}
		fmt.Println()
	}


}

