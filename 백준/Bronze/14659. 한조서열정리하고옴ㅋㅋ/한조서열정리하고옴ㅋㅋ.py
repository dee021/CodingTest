import sys
def sol(lst):
    def subsol(m):
        temp = 0
        for i in range(m+1, len(lst), 1):
            if lst[i] < lst[m]:
                temp += 1
            if lst[i] > lst[m]:
                break
        return temp
    maxv = max(list(map(subsol, [x for x in range(len(lst))])))
    return maxv

n = int(input())
arr = list(map(int, sys.stdin.readline().split()))

print(sol(arr))