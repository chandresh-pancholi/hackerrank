package main

import (
	"fmt"
)

func main()  {
	var X float64 = 6.0
	var i int = 4
	var j int = 2

	index := 0

	output  := make([]float64, i*(i+1)/2)
	output[index] = X
	for row := 1; row <= i && X != 0.0; row++  {
		for col := 1; col <= row ; col++  {
			X = output[index]

			if X >= 1.0 {
				output[index] = 1.0
			} else {
				output[index] = X
			}

			if X >= 1.0 {
				X = X-1
			} else {
				X = 0
			}
			output[index + row] = output[index+row] + X/2
			output[index+row+1] = output[index+row+1] + X/2
			index++

		}
	}
	fmt.Print(output[i*(i-1)/2 + j - 1])
}

