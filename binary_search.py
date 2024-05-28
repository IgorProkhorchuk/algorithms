def binary_search(lowest_digit, highest_digit, arithmetic_mean, number_to_guess):
    while arithmetic_mean != number_to_guess:
        arithmetic_mean = (lowest_digit + highest_digit) // 2
        if arithmetic_mean < number_to_guess:
            lowest_digit = arithmetic_mean
            print(arithmetic_mean)
        else:
            highest_digit = arithmetic_mean
            print(arithmetic_mean)
    print(f"your number is: {arithmetic_mean}")

print("Type number of elements in the list: ")
nubmer_of_elements = int(input())

source_list = list(range(1, nubmer_of_elements + 1))

number_to_guess = int(input("Guess the number: "))

lowest_digit = source_list[0]
highest_digit = source_list[-1]
arithmetic_mean = None

binary_search(lowest_digit, highest_digit, arithmetic_mean, number_to_guess)