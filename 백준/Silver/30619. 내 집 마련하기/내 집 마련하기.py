import sys
input = sys.stdin.readline

def sol(lst, left, right):
    addr = sorted([index[x] for x in range(left, right+1)])
    for p in range(left, right+1):
        lst[addr[p-left]] = p
    print(*lst)


n = int(input())
arr = list(map(int, input().split()))
index = {arr[i]:i for i in range(n)}
for _ in range(int(input())):
    l, r = map(int, input().split())
    sol(arr.copy(), l, r)