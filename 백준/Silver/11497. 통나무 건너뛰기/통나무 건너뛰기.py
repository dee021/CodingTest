import sys
input = sys.stdin.readline

def sol(lst1, lst2):
    res = 0
    temp = lst1 + lst2[::-1] + [lst1[0]]
    for i in range(len(temp)-1):
        res = max(res, abs(temp[i] - temp[i+1]))
    return res

for _ in range(int(input())):
    n = int(input())
    arr = sorted(map(int, input().split()))
    print(sol(arr[0::2], arr[1::2]))