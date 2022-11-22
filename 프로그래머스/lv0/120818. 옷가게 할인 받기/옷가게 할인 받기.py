import math
def solution(price):
    if price>=500000:
        disc = 0.8
    elif price>=300000:
        disc = 0.9
    elif price >= 100000:
        disc = 0.95
    else: disc=1
    answer = math.floor(price*disc)
    return answer