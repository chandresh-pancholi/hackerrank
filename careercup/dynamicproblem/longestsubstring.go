package main

import (
	"fmt"
)

func main() {
	var input string = "GEEKSFORGEEKS"

	var prev int = 0
	var visited [256]int

	for i := 0; i < len(visited) ;i++  {
		visited[i] = -1
	}
	visited[input[0]] = 0

	curr_len := 1
	max_len := 1

	for i := 1; i < len(input) ;i++  {
		prev = visited[input[i]]
		if visited[input[i]] == -1 || i - prev > curr_len{
			curr_len++
		} else {
			if curr_len > max_len {
				 max_len = curr_len
			}
			curr_len = i - prev
		}
		visited[input[i]] = i
	}

	if max_len < curr_len {
		 max_len = curr_len
	}

	fmt.Println(max_len)
}
