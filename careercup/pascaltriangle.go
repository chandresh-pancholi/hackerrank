package main

import (
	"fmt"
)

func main()  {
	var n int = 6
	output := make([][]int, n)
	for i := range output {
		output[i] = make([]int, n)
	}

	for line := 0; line < n ;line++  {
		for i := 0 ; i <= line ;i++  {
			if line == i || i == 0 {
				output[line][i] = 1
			} else {
				output[line][i] = output[line-1][i-1] + output[line-1][i];
			}

			fmt.Print(output[line][i]," ")
		}
		fmt.Println()
	}
}

