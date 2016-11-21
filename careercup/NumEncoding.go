package main

import (
	"fmt"
	"strconv"
)

func main()  {
	var input string = "1234"

	fmt.Println(findDecodeCombination(input))
}

func findDecodeCombination(input string)  int {
	if len(input) == 0 || len(input) == 1{
		return 1
	}
	var num int = 0
	num += findDecodeCombination(input[1:])

	if isValid(input[0:2]){
		num += findDecodeCombination(input[2:])
	}
	return num
	
}

func isValid(input string) bool  {
	num,_ := strconv.Atoi(input)
	if num <=26 || num >= 1{
		return true;
	} else {
		return false
	}

}