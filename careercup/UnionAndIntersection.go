package main

import (
	"fmt"
)

func main()  {
	var arr1 []int = []int{1, 2, 4, 5, 6, 7}
	var arr2 []int = []int{2, 3, 5, 7, 8}

	var m int = len(arr1)
	var n int = len(arr2)

	var i int = 0
	var j int = 0
	for i < m && j < n  {
		if arr1[i] > arr2[j] {
			fmt.Print(arr2[j], " ")
			j++
		} else if arr1[i] < arr2[j] {
			fmt.Print(arr1[i], " ")
			i++

		}else {
			fmt.Print(arr1[i], " ")
			i++
			j++
		}
	}
	for i < m  {
		fmt.Print(arr1[i], " ")
		i++
	}
	for j < n  {
		fmt.Print(arr2[j], " ")
		j++
	}

	fmt.Println()

	i = 0
	j = 0

	for i < m && j < n  {
		if arr1[i] > arr2[j] {
			j++
		} else if arr1[i] < arr2[j] {
			i++
		}else{
			fmt.Print(arr1[i], " ")
			i++
			j++
		}
	}
}

