package main

import "fmt"

func main()  {
	values := [][]int{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
	m := len(values)
	n := len(values[0])
	var flag bool = true;
	for i := 0; i < m; i++ {
		if flag {
			for j := 0; j < n; j++ {
				fmt.Print(" ", values[i][j] )
			}
			flag = !flag
		} else {
			for j := n-1; j >= 0; j-- {
				fmt.Print(" ", values[i][j] )
			}
			flag = !flag
		}
 	}

}
