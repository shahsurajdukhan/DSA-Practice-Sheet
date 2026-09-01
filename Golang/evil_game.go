package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {

	rand.Seed(time.Now().UnixNano())

	number := rand.Intn(100) + 1
	guess := 0
	attempts := 0

	fmt.Println("Welcome to the Evil Number Guessing Game")
	fmt.Println()
	fmt.Println("I'm thinking of a number between 1 and 100...")
	fmt.Println("Can you defeat me?")
	fmt.Println()

	for guess != number {

		fmt.Print("Enter Your Guess: ")
		fmt.Scan(&guess)

		attempts++

		if guess < number {
			fmt.Println("Too Low! My Number is HIGHER")

		} else if guess > number {
			fmt.Println("Too High! My Number is LOWER!")
		} else {
			fmt.Println()
			fmt.Println("How did you do that")
			fmt.Println("You guessed the number!")
			fmt.Println("Attempts:", attempts)
			fmt.Println("You defeated the evil computer")
		}

		fmt.Println()

	}
}