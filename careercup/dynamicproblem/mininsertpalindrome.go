package main

import (
	"fmt"
	"math"
)

func main()  {
	var input string = "geeks"
	var len int = len(input)

	mint :=make([][]int, len)
	for i := range mint{
		mint[i] = make([]int, len)
	}

	for gap := 1; gap <=len ;gap++  {
		h := gap
		for l := 0 ;h < len ;l++  {
			if input[l] == input[h] {
				mint[l][h] = mint[l+1][h-1]
			} else {
				mint[l][h] = int(math.Min( float64(mint[l+1][h]), float64(mint[l][h-1])) )+ 1
			}
			h++
		}
	}

	fmt.Print(mint[0][len-1])


}

