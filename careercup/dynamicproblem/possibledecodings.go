package main

import (
	"fmt"
)

func main()  {
	digits := []int{1,2,1}
	len := len(digits)

	count := make([]int, len + 1)
	count[0] = 1
	count[1] = 1

	for i := 2; i <= len ;i++  {
		count[i] = 0
		if digits[i - 1] > 0 {
			count[i] = count[i-1]
		}
		if digits[i-2] < 2 || digits[i-2] == 2 && digits[i-1] < 7 {
			count[i] += count[i-2]
		}
	}

	fmt.Println(count[len])
}

