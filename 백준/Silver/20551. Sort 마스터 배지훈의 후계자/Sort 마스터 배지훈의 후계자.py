import sys
input = sys.stdin.readline
import bisect

n, m = map(int, input().split())
nums = set()
arr, ans = [], []
for _ in range(n):
    k = int(input())
    nums.add(k)
    arr.insert(bisect.bisect_left(arr, k), k)
for _ in range(m):
    k = int(input())
    ans.append(str(bisect.bisect_left(arr, k)) if k in nums else '-1')
sys.stdout.write('\n'.join(ans))