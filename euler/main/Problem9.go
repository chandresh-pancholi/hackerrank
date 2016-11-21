package main

import "fmt"

func main()  {
	var s int = 1000
	for a := 1; a <= s/3; a++ {
		for b := a + 1; b <= s/2; b++ {
			c := s - a - b
			if a*a + b*b == c*c {
				fmt.Println(a*b*c)
			}
		}
	}

}
