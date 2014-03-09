package main

import "fmt"

func main() {
	// We can declare variables like this
	x := 14
	y := 16
	fmt.Println(x, y) // => 14 16
	x, y = swap(x, y)
	fmt.Println(x, y) // => 16 14
}

// It's so simple to return multiple result
func swap(a int, b int) (int, int) {
	return b, a
}
