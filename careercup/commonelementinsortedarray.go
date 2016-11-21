package main

import (
	"fmt"
)

func main()  {
	var input1 []int = []int{1, 5, 10, 20, 40, 80}
	var input2 []int = []int{6, 7, 20, 80, 100}
	var input3 []int = []int{3, 4, 15, 20, 30, 70, 80, 120}

	var len1 int = len(input1)
	var len2 int = len(input2)
	var len3 int = len(input3)

	i := 0
	j := 0
	k := 0

	for i < len1 && j < len2 && k < len3 {
		if input1[i] == input2[j] && input2[j] == input3[k] {
			fmt.Println(input1[i])
			i++
			j++
			k++
		} else if input1[i] < input2[j] {
			i++
		} else if input2[j] < input3[k] {
			j++
		} else {
			k++
		}
	}
}

