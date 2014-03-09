package main

import "fmt"

var a bool = true
// Multiple declaration
var (
	x = 5
	y = 6
	z = 7
)

func main() {
	// Those variables can be edited
	var b int = 9
	// But it's constant with 'int' type
	const c = 8

	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(c)
	fmt.Println(x, y, z)
}
