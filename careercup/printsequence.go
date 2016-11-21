package main

import (
	"fmt"
	)

const ARRAY_SIZE  = 100

func main()  {
	var n int = 4
	var k int = 3
	var arr[3]int
	printsequence(n,arr,k,0)

}

func printsequence(n int, arr [3]int, k int, index int)  {
	if k == 0 {
		printArray(arr, index)
	}
	if k > 0 {
		for i := 1 ; i <= n ;i++  {
			arr[index] = i
			printsequence(n, arr, k-1, index+1)
		}
	}
}

func printArray(arr [3]int, size int)  {
	for i :=0;i < size ;i++  {
		fmt.Print(arr[i], " ")
	}
	fmt.Println()
}