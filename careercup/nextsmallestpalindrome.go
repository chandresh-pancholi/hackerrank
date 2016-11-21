package main

import (
	"fmt"
)

func main()  {
	var input []int  = []int{7,1,3,3,2,2}

	checknextpalindrome(input, len(input))
}

func checknextpalindrome(nums []int, n int ) {
	if isAll9s(nums, n) {
		fmt.Print(1, " ")
		for i := 0; i < n-1 ;i++  {
			fmt.Print(0, " ")
		}
		fmt.Print(1, " ")
	} else {
		getnextpalindromeUtil(nums, n)
	}
}

func isAll9s(nums []int, n int)  bool{
	for i := 0; i < n ;i++  {
		if nums[i] != 9 {
			return false
		}
	}
	return true
}

func getnextpalindromeUtil(nums []int, n int)  {
	mid := n/2
	leftsmaller := false

	i := mid-1
	j := 0
	if n % 2 == 0 {
		j = mid
	}else {
		j = mid+1
	}

	for i >= 0 && nums[i] == nums[j]  {
		i--
		j++
	}

	if i < 0 || nums[i] < nums[j] {
		leftsmaller = true
	}
	for i >= 0  {
		nums[j] = nums[i]
		i--
		j++
	}

	if leftsmaller == true {
		i = mid - 1
		carry := 1

		if n % 2 == 1 {
			nums[mid] = nums[mid] + carry
			carry = nums[mid]/10
			nums[mid] = nums[mid]%10
			j = mid + 1
		} else {
			j = mid
		}

		for i >= 0  {
			nums[i] = nums[i] + carry
			carry = nums[i] / 10
			nums[i] = nums[i] % 10
			nums[j] = nums[i]
			i--
			j++
		}
	}
	for i := 0; i < n ;i++  {
		fmt.Print(nums[i], " ")
	}

}
func printArray(nums []int, n int )  {
	for i :=0 ; i < n ;i++  {
		fmt.Print(nums[i], " ")
	}
}
