package main

import (
	"fmt"
	"math"
)

func main()  {
	var input [][]int = [][]int{
		{1, 2, 3},
		{4, 8, 2},
		{1, 5, 3} };
	m := len(input)
	n := len(input[0])

	output := make([][]int , m)
	for i := range output {
		output[i] = make([]int, n)
	}
	output[0][0] = input[0][0]
	for i := 1; i < m ;i++  {
		output[i][0] = output[i-1][0] + input[i][0]
	}
	for j := 1; j < n ;j++  {
		output[0][j] = output[0][j-1] + input[0][j]
	}

	for i := 1; i < m ;i++  {
		for j := 1;j<n ;j++  {
			output[i][j] = int(math.Min(float64(output[i-1][j-1]), math.Min( float64(output[i-1][j]), float64(output[i][j-1])))) + input[i][j]
		}
	}
	for i := 0; i < m ;i++  {
		for j := 0; j < n ;j++  {
			fmt.Print(output[i][j], " ")
		}
		fmt.Println()
	}
	fmt.Println(output[m-1][n-1])

}
