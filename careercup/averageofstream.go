package main

import (
	"fmt"
)

var sum int = 0
var n int  = 0

func main()  {
	var input []int = []int{10, 20, 30, 40, 50, 60}
	for i := 0; i <len(input) ;i++  {
		avg := getAverage(input[i])
		fmt.Println(avg)
	}
}

func getAverage(value int) int  {
	sum += value
	n++
	return sum/n
}

