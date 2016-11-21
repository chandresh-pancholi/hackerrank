package main

import (
	"fmt"
)

func main()  {
	var  n int = 14
	var k int = 2
	fmt.Println(josephus(n,k))
}

func josephus(n int, k int) int {
	if n == 1 {
		return 1
	} else {
		return (josephus(n-1, k)+(k-1)) % n + 1
	}
}
