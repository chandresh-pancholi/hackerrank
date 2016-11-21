package main

import (
	"fmt"
	"time"
)

func main()  {
	t := time.Now().Unix()
	fmt.Println(t)
	var prime_number int64 = 1
	var number int64 = 1


	for prime_number < 10001 {
		number += 2
		if isPrime(number) {
			prime_number++
		}
	}
	fmt.Println(number)
	fmt.Println(time.Now().Unix())
}

func isPrime(number int64) bool {
	var i int64
	for i = 2; i < number; i++  {
		if number % i == 0 {
			return false
		}
	}
	return true

}
