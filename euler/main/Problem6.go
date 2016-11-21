package main

import (
	"fmt"
	"time"
)

func main()  {
	t := time.Now().Unix()
	var number int64 = 100
	var square int64 = 0
	var sum int64 = 0
	var i int64
	for i = 1; i <= number ; i++  {
		square = square + i*i
		sum += i
	}
	fmt.Println(time.Now().Unix() - t)
	fmt.Println(sum*sum - square)
}
