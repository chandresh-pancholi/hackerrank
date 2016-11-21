package main

import (
	"fmt"
)

const V = 4
func main()  {

	graph := [][]int {{0, 1, 1, 1},
		{0, 0, 0, 1},
		{0, 0, 0, 1},
		{0, 0, 0, 0}}
	u := 0
	v := 3
	k := 2

	fmt.Println(countpossiblepath(graph, u, v, k))
}

func countpossiblepath(grapth [][]int, u int, v int, k int)  {
	count := make([][][]int, V)
	for i := range count{

	}
}