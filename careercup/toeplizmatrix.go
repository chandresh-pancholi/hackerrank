package main

import (
	"fmt"
)

func main()  {
	var input [][]int = [][]int{{6,7,8,9,2},
		{4,6,7,8,9},
		{1,4,6,7,8},
		{0,1,4,6,7}}

	var m int = len(input)
	var n int = len(input[0])

	for i := 0; i < m-1 ; i++  {
		for j := 0; j < n-1 ;j++  {
			fmt.Print(input[i][j], " ")
			if input[i][j] != input[i+1][j+1] {
				fmt.Println("False")
				break
			}
		}
		fmt.Println()
	}
}

