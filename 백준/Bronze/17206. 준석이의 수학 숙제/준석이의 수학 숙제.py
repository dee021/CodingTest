import sys
input = sys.stdin.readline

arr = [0 for _ in range(80001)]
for i in range(1, 80001):
    arr[i] = arr[i-1]
    if i%3 == 0 or i%7 == 0:
        arr[i] += i

input()
for n in map(int, input().split()):
    print(arr[n])