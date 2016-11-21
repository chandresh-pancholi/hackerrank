package main

import (
	"fmt"
)

func main()  {
	var input []int = []int {5, 5, 10, 100, 10, 5}
	var incl int = input[0]
	var excl int = 0
	var excl_new int
	for i := 1; i < len(input) ; i++  {
		if incl > excl{
			 excl_new = incl
		} else {
			excl_new = excl
		}

		incl = excl + input[i]
		excl = excl_new
	}
	if incl > excl {
		fmt.Println(incl)
	} else {
		fmt.Println(excl)
	}
}

