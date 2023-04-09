import sys
input = sys.stdin.readline

nums = set([2**x for x in range(31)])

for _ in range(int(input())):
    print(int(int(input()) in nums))