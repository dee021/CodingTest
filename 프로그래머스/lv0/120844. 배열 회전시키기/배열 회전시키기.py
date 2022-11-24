def solution(numbers, direction):
    direction = 1 if direction == 'right' else 0
    if direction:
        numbers.insert(0, numbers.pop())
    else:
        numbers.append(numbers.pop(0))
    return numbers