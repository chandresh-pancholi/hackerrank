package main

/**
Print the count of duplicate char in a given string in same order. Ex: Input- 'abbaccdbac', Output- 'a3b3c3d1'
 */
import (
	"fmt"
)

func main()  {
	var input string = "abbaccdbac"
	byteArray := []byte(input)
	var len int = len(input)

	var count [256]int

	for i := 0 ; i < len ;i++  {
		if count[byteArray[i]] != 0{
			count[byteArray[i]] = count[byteArray[i]] + 1
		} else {
			count[byteArray[i]] = 1
		}
	}

	for i := 0; i < len ; i++  {
		if count[byteArray[i]] >= 0 {
			fmt.Print(string(byteArray[i]), count[byteArray[i]], " ")
			count[byteArray[i]] = -count[byteArray[i]]
		}
	}
}

