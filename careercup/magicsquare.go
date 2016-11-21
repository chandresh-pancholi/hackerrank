package main

import (
	"fmt"
)

func main()  {
	var n int = 3;

	output := make([][]int, n)
	for i := range output {
		output[i] = make([]int, n)
	}

	var i int = n/2
	var j int = n-1

	for num := 1; num <= n*n;{
		if i == -1 && j == n {
			i = 0
			j = n-2
		} else {
			if i < 0 {
				i = n-1
			}
			if j == n {
				j = 0
			}
		}

		if output[i][j] != 0 {
			i = i+1
			j = j-2
			continue
		}else {

			output[i][j] = num
			num++
		}
		i--
		j++
	}

	fmt.Print(output)
}

