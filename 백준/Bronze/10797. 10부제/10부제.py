def findCar(strno):
    return int(strno[-1])

day = int(input())
ans = list(filter(lambda x : x == day, map(findCar, input().split())))

print(len(ans))