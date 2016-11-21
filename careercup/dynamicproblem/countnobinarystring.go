package main

import (
	"fmt"
)

func main() {
	n := 3

	a := make([]int, n)
	b := make([]int , n)

	a[0] = 1
	b[0] = 1
	for i:= 1 ;i <n ;i++  {
		a[i] = a[i-1]+b[i-1]
		b[i] = a[i-1]
	}
	fmt.Println(a[n-1] + b[n-1])
}
