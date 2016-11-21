package main

import (
	"fmt"
	"math"
)

func main()  {
	fmt.Println(maxProductCutting(5))
}

func maxProductCutting(n int) int  {
	table := make([]int, n + 1)

	table[0] = 0
	table[1] = 1
	for i := 1; i <= n; i++ {
		max_val := math.MinInt64
		for j := 1; j <= i/2  ;j++ {
			max_val = int(math.Max(float64(max_val), math.Max(float64(i * (j - i)), float64(i * table[j - i]))))
		}
		table[i] = max_val
	}

}
