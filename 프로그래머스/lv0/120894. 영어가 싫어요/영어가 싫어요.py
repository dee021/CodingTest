def solution(numbers):
    num =  ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for number in num:
        numbers = numbers.replace(number, str(num.index(number)))
    return int(numbers)