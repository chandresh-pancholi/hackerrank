package main

/**
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
 */
import "fmt"

func main()  {
	hm := make(map[string]bool)

	hm["leet"] = true
	hm["code"] = true

	var input string = "leetcode"
	fmt.Println(wordsegment(hm, input))

}

func wordsegment(hm map[string]bool, input string) bool  {
	if hm[input] {
		return true
	}
	end := 1

	len := len(input)

	for end <= len {
		if hm[input[0:end]] {
			success := true

			if end < len {
				success = wordsegment(hm, input[end:])
			}

			if success {
				return true
			}
		}
		end++
	}
	return false
}