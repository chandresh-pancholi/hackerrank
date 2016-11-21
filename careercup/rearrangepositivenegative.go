package main

import "fmt"

func main()  {
	var input []int = []int{-1, 2, -3, 4, 5, 6, -7, 8, 9}
	var len int = len(input)

	i := -1

	for j := 0; j < len ;j++  {
		if input[j] < 0 {

			i++
			var temp int = input[i]

			input[i] = input[j]
			input[j] = temp
		}
		fmt.Print(input[j], " ")
	}


}
