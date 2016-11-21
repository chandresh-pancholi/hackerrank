package main

import (
	"fmt"
)

func main()  {
	var mplusnarray[] int = []int{2, 8, -1, -1, -1, 13, -1, 15, 20}
	var narray[] int  = []int{5, 7, 9, 25}

	var n int = len(narray)
	var m int = len(mplusnarray) - n

	var k int = len(mplusnarray)-1;

	for i := len(mplusnarray) - 1; i>=0 ;i--  {
		if mplusnarray[i] != -1 {
			mplusnarray[k] = mplusnarray[i]
			k--
		}
	}

	var i int = n
	var j int = 0
	k = 0

	for k < m + n  {
		if i < (m+n) && mplusnarray[i] <= narray[j]  || j == n {
			mplusnarray[k] = mplusnarray[i]
			k++
			i++
		}else {
			mplusnarray[k] = narray[j]
			k++
			j++
		}
	}

	for i := 0; i < len(mplusnarray) ; i++ {
		fmt.Println(mplusnarray[i])
	}


}

