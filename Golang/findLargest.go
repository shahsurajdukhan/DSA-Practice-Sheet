// Find The Largest Element
// Input:  [10, 5, 20, 8, 15]
// Output: 20

package main
import "fmt"

func findLargest(arr []int) int {
	largest := arr[0]

	for i := 1; i < len(arr); i++ {
		if arr[i] > largest {
			largest = arr[i]
		}
	}
	return largest
}

func main() {
	arr := []int {10,5,20,8,15}

	result := findLargest(arr)

	fmt.Println("Largest element:", result)
}