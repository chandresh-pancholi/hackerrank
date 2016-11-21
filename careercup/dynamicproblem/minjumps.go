package main

import (
	"fmt"
	"math"
)

func main()  {
	var input []int = []int{1, 3, 6, 1, 0, 9}
	var len int = len(input)
	jumps := make([]int, len)
	if len == 0 || input[0] == 0 {
		"No jumps"
	}
	jumps[0] = 0
	for i := 1; i < len ;i++  {
		jumps[i] = math.MaxInt64
		for j := 0 ;j < i ;j++  {
			if i <= j + input[j] && jumps[j]  != math.MaxInt64  {
				jumps[i] = int(math.Min( float64(jumps[i]), float64(jumps[j] + 1 )))
			}
		}
	}

	fmt.Println(jumps[len - 1])
}

