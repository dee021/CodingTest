import sys
input = sys.stdin.readline

n = input().strip()
n = n[:len(n)-2]
f = int(input())
res = int(n+'00')%f
if res == 0:
    print('00')
else:
    print('%02d' %(f-res))