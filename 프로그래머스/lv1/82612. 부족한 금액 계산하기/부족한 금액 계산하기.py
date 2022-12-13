def solution(price, money, count):
    count = sum([x for x in range(1, count + 1)])
    answer = price * count - money
    return answer if answer >= 0 else 0