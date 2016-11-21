package main

import "fmt"

const ARRAY_SIZE  = 100

var output [ARRAY_SIZE]string
func main()  {
	var input int = 3
	paranthesis(input, 0 , 0, 0)
}

func paranthesis(n int, pos int, open int, close int) {
	if close == n {
		for i := 0; i < len(output); i++ {
			fmt.Print(output[i] + " ")

		}
		fmt.Println()
		return
	} else if (open > close) {
		output[pos] = "}"
		paranthesis(n, pos + 1, open, close + 1)
	}
	if open < n {
		output[pos] = "{"
		paranthesis(n, pos + 1, open + 1, close)
	}

}
