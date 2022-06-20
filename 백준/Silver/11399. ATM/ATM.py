import sys

n = int(input())
time = list(map(int, sys.stdin.readline().split()))

time.sort()
def sumTime(num):
    return sum(time[0:(num+1)])

sumtime = list(map(sumTime, [x for x in range(n)]))
print(sum(sumtime))