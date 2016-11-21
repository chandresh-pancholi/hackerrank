package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}
	var len int = len(input)
	var  x int = 3
	var  y int = 6
	var i int  = 0
	var pre int
	for ; i < len ; i++  {
		if input[i] == x || input[i] == y {
			pre = i
			break
		}
	}

	var min int = 99999999999
	for ; i < len; i++ {
		if(input[i] == x || input[i] == y) {
			if input[pre] != input[i] && i - pre < min {
				min = i - pre
			}
			pre = i
		}
	}
	fmt.Println(min)
}

