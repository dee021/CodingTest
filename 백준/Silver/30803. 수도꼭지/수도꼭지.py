import sys
input = sys.stdin.readline

def update(idx, liter):
    global m
    if state[idx]:
        m += liter - water[idx]
    water[idx] = liter
        
def toggle(idx):
    global m
    if state[idx]:
        m -= water[idx]
    else:
        m += water[idx]
    state[idx] ^= 1

ans = []
n = int(input())
state = [0] + [1 for _ in range(n)]
water = [0] + list(map(int, input().split()))
m = sum(water)
ans.append(m)
for _ in range(int(input())):
    o, *args = map(int, input().split())
    if o == 1:
        update(*args)
    else:
        toggle(*args)
    ans.append(m)
print(*ans, sep='\n')