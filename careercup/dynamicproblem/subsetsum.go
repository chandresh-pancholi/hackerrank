package main

import (
	"fmt"
)

func main()  {
	var input []int = []int{3, 34, 4, 12, 5, 2}
	var len int = len(input)
	var sum int = 9
	
	fmt.Println(isSubsetSum(input, len, sum))

}

func isSubsetSum(input []int, len, sum int) bool  {
	table := make([][]bool, sum+1)
	for i := range table{
		table[i] = make([]bool, len+1)
	}

	for i := 0; i <= len;i++  {
		table[0][i] = true
	}
	for i := 0; i <= sum ;i++  {
		table[i][0] = false
	}

	for i := 1; i <= sum ;i++  {
		for j := 1; j <= len ;j++  {
			table[i][j] = table[i][j-1]
			if i - input[j-1] >= 0 {
				table[i][j] = table[i][j] || table[i - input[j-1]][j-1]
			}
		}
	}
	return table[sum][len]
}

