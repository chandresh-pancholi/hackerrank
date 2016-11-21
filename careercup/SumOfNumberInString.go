package main

import (
	"fmt"
	"encoding/binary"
	"strconv"
)

func main()  {
	var input string = "11aa22bb33cc44ff"

	//var len int = len(input)
	byteArray := []byte(input)
	var result int = 0
	var sum int = 0
	for i := 0; i < binary.Size(byteArray) ;i++  {
		if byteArray[i] - 48 >= 0 && byteArray[i] - 48 <= 9 {
			number, _ := strconv.ParseInt(string(byteArray[i]), 10, 0)
			result = result*10 + int(number)
		} else {
			//fmt.Print(result, " ")
			sum += result
			result = 0
		}
	}
	sum += result
	fmt.Print(sum)

}

