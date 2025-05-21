import sys
input = sys.stdin.readline

def bruteForce(cnt, num):
    if not num or not cnt:
        if num == cnt == 0: return True
        return False
    
    for n in fibo[::-1]:
        if num >= n:
            if (bruteForce(cnt-1, num-n)):
                return True
    
    return False

fibo = [1, 1]

while fibo[-1] <= 10**16:
    fibo.append(fibo[-1] + fibo[-2])

for _ in range(int(input())):
    print(bruteForce(*map(int, input().split())) and "YES" or "NO")