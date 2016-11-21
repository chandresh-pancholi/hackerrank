package main

import (
	"fmt"
	"math"
)

func main()  {
	var input1 []int = []int{2, 3, 7, 10, 12, 15, 30, 34}
	var input2 []int = []int{1, 5, 7, 8, 10, 15, 16, 19}
	
	var m int = len(input1)
	var n int = len(input2)
	i := 0
	j := 0
	
	sum1 := 0
	sum2 := 0
	result := 0
	
	for  i < m && j < n  {
		if input1[i] < input2[j] {
			sum1 += input1[i]
			i++
		} else if input1[i] > input2[j] {
			sum2 += input2[j]
			j++
		} else {
			result += int(math.Max(float64(sum1), float64(sum2)))
			sum1 = 0
			sum2 = 0
			for i < m && j < n && input1[i] == input2[j] {
				result += input1[i]
				i++
				j++
			}
		}
	}

	for i < m  {
		sum1 += input1[i]
		i++
	}
	for  j < n  {
		sum2 += input2[j]
		j++
	}

	result += int(math.Max(float64(sum1), float64(sum2)))
	fmt.Println(result)
}

