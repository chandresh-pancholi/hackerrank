package main

/**
Given the following decoder, write the encoder. (The encoder should be written to compress whenever possible):

p14a8xkpq -> p14akkkkkkkkpq

(8xk gets decoded to kkkkkkkk. The only other requirement is that encodings be unambiguous)

Note that the String can have any possible ascii character
 */
import (
	"fmt"
	"strconv"
)

func main()  {
	var input string = "p14akkkkkkkkpqq"
	var result string = ""
	var len int = len(input)
	i := 0

	for i < len {
		c := input[i]
		counter := 0
		for i < len-1 && input[i+1] == c {
			i++
			counter++
		}
		if counter+1 > 1 {
			result = result+strconv.Itoa(counter+1)+"x"+string(c)

		} else {
			result = result+string(c)
		}
		i++
	}

	fmt.Println(result)
}

