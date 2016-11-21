package main

/**
given 2 strings A and B. generate all possible solutions when B is merged in A.
Ex: A = "hey"
B: "sam"
then solutions are :

heysam,hseaym,hesaym,sahemy etc.

notice that order should be the same for both of strings while merging.
 */

import (
	"fmt"
)

func main()  {
	var str1 string = "hey"
	var str2 string = "sam"


	mergestring(str1, str2, "")
}

func mergestring(str1 string, str2 string, out string)  {

	if str1 == ""{
		fmt.Println(out + str2)
		return
	}
	if str2 == "" {
		fmt.Println(out + str1)
		return
	}

	mergestring(str1[1:], str2, out + string(str1[0]))
	mergestring(str1, str2[1:], out + string(str2[0]))

}
