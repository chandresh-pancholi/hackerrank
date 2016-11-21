package main

import (
	"fmt"
)
var arr [ARRAY_SIZE]int
const (
	ARRAY_SIZE  = 100
	MAX_POINT = 3
)
func main() {
	var n int = 4

	pointCombo(n, 0)

}

func pointCombo(n int, i int)  {

	if n == 0 {
		printArray(arr, i)
	}else if n > 0 {

		for k := 1; k <= MAX_POINT ; k++ {
			arr[i] = k
			pointCombo(n - k, i + 1)
		}
	}
}

func printArray(arr [ARRAY_SIZE]int, size int)  {
	for i := 0; i < size ;i++  {
		fmt.Print(arr[i], " ")
	}
	fmt.Println()
}
