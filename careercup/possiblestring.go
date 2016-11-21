package main

import (
	"fmt"
)

/*
Print all possible strings of length k that can be formed from a set of n characters
 */
func main() {
	var set string = "ABCDEF"
	var len int = len(set)

	var k int = 3

	possibleString(set,"",len-1, k)
}

func possibleString(set string, prefix string, end int, k int)  {
	if k == 0 {
		fmt.Println(prefix, )
		return
	}

	for i:=0 ; i <= end ;i++  {
		newprefix := prefix + string(set[i])
		possibleString(set, newprefix, end,k-1)
	}
}
