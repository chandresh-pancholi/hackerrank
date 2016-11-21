package main

import (
	"fmt"
)

type pair struct {
	a int
	b int
}
func main()  {
	var arr []pair = []pair{{5, 24}, {15, 25},
		{27, 40}, {50, 60} }
	var len int = len(arr)

	mcl := make([]int, len )

	for i := 0; i < len ;i++  {
		mcl[i] = 1
	}

	for i := 1; i < len ;i++  {
		for j := 0; j < i ;j++  {
			if arr[i].a > arr[j].b && mcl[i] < mcl[j] + 1  {
				mcl[i] = mcl[j] + 1
			}
		}
	}

	max := 0
	for i := 0; i < len ; i++ {
		if mcl[i] > max {
			max = mcl[i]
		}
	}

	fmt.Println(max)

}

