package main

import (
	"fmt"
	"strconv"
)

func main()  {
	var max int = 0;
	var i int
	var j int
	for i = 100; i < 1000 ; i++  {
		for j = 100; j < 1000 ; j++  {
			if isPalindrome(i*j) {
				if max < i*j {
					max = i*j;
				}
			}
		}
	}
	fmt.Println(max)
}

func isPalindrome(value int) bool {
	data := []rune(strconv.Itoa(value))
	result := []rune{}

	// Add runes in reverse order.
	for i := len(data) - 1; i >= 0; i-- {
		result = append(result, data[i])
	}

	// Return new string.
	return string(result) == strconv.Itoa(value)
}
