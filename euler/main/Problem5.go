package main

import (
	"fmt"
	"time"
)

func main()  {
	t := time.Now().Unix()
	fmt.Println(t)
	var number int64 = 1;
	var i int64 = 2;
	for i <= 20  {
		if number % i == 0 {
			i++
		} else {
			number++;
			i = 2;
		}
	}
	fmt.Println(time.Now().Unix() - t)
	fmt.Println(number)
}