package main

import (
	"fmt"
)

func main() {
	var input string = "aabdceaaabbbcd"
	byteArray := []byte(input)
	var len int = len(byteArray)
	var count[256] int

	for i := 0 ; i < len ; i++  {
		count[byteArray[i]] = count[byteArray[i]] + 1
	}

	for i := len - 1; i >= 0; i-- {
		if(count[byteArray[i]] > 0 ) {
			fmt.Print(string(byteArray[i]), " ")
			count[byteArray[i]] = -count[byteArray[i]]
		}
	}
}
