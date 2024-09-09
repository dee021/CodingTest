import sys
input = sys.stdin.readline

def sol(k):
    if k == 1:
        return 1
    number = [x for x in range(9, 1, -1)]
    factor = []
    while True:
        for num in number:
            if k%num == 0:
                k //= num
                factor.append(num)
                break
        else:
            break
    if k > 10: return -1
    return len(factor)
    

for _ in range(int(input())):
    n = int(input())
    print(sol(n))