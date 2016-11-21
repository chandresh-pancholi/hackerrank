package main

import (
	"fmt"
)

func main()  {
	//var val int64 = 600851475143
	var input int64
	_,err := fmt.Scanf("%d", &input)

	if err != nil {
		return ;
	}

	for input > 0  {
		var lpf int64 = 2
		var val int64
		_, err := fmt.Scanf("%d", &val)
		if err != nil {
			return ;
		}
		for val > lpf {
			if val % lpf == 0 {
				val = val / lpf
				lpf = 2
			} else {
				lpf++;
			}
		}
		fmt.Println(lpf)
		input--
	}

}
