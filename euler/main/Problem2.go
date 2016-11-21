package main

import "fmt"

func main() {
	var number int64  = 4000000;
	var temp int64
	var num1 int64 = 1
	var num2 int64 = 1
	var sum int64 = 0

	for num2 + num1 <= number {
		temp = num2;
		num2 = num1 + num2;
		num1 = temp
		//fmt.Println(num2)
		if num2 % 2 == 0 {
			sum += num2
		}
	}
	fmt.Println(sum)
}

