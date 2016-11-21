package main

import (
	"fmt"
	"math"
)

func main() {
	var input []float64 = []float64{1, 2, 3, 1, 3, 6, 6}
	var len int = len(input)

	for i := 0; i < len ; i++  {
		if input[int (math.Abs(input[i]))] >= 0 {
			input[int (math.Abs(input[i]))] = -input[int (math.Abs(input[i]))]
		} else {
			fmt.Print(math.Abs(input[i]), " ")
		}
	}
}
