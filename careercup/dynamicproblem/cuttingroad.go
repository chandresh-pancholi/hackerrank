package main

import (
	"fmt"
	"math"
)

func main()  {
	var input []int = []int{1, 5, 8, 9, 10, 17, 17, 20}
	var len int = len(input)

	val := make([]int, len + 1)



	val[0] = 0
	for i := 1; i <= len ;i++  {
		max_val := math.MinInt64
		for j := 0; j < i ;j++  {
			max_val = int(math.Max(float64(max_val), float64(input[j] + val[i - j - 1])))
		}
		val[i] = max_val
	}

	fmt.Println(val[len])
}

