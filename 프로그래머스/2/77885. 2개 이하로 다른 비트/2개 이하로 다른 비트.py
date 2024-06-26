def solution(numbers):
    answer = []
    for number in numbers:
        if number % 2:
            if (number-1)%4:
                for i, b in enumerate(bin(number)[::-1]):
                    if b in ['b', '0']:
                        answer.append(number + 2**(i-1))
                        break
            else:
                answer.append(number+1)
        else:
            answer.append(number+1)
    return answer