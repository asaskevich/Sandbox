package main

import "fmt"

func main() {
	fmt.Println(summa(5, 6)) // 5 + 6 = 11
}

// We pass two arguments to function and return sum
func summa(a int, b int) int {
	return a + b
}
