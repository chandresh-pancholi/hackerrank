package main

import (
	"fmt"
	//"time" 142913828922
)

func main()  {
	var n int64 = 2000001
	//var prime_number int64 = 1
	//var number int64 = 1
	var sum int64 = 2
	prime := make([]bool, n)
	fmt.Println(len(prime))

	var i int64;
	for i = 0 ; i <= n; i++ {
		prime[i] = true
	}

	var p int64

	for p = 2 ; p*p <= n; p++ {
		if prime[p] {
			for i := p*2; i <= n; i += p {
				prime[i] = false;
			}
		}
	}

	for p = 2; p <= n; p++ {
		if prime[p] {
			sum += p
		}
	}
	fmt.Println(sum)

	//t := time.Now().Unix()
	//for number+2 < 2000000  {
	//	number += 2
	//	if isPrime(number) {
	//		prime_number++
	//		sum += number
	//	}
	//}
	//fmt.Println(time.Now().Unix() - t)
	//fmt.Println(sum)
}
//func isPrime(number int64) bool {
//	var i int64
//	for i = 2; i < number; i++  {
//		if number % i == 0 {
//			return false
//		}
//	}
//	return true
//
//}
//
