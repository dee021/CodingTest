def isWonder(num):
    tmp = sum(map(int, str(num)))
    if num%tmp:
        return 0
    return 1

ans = sum(map(isWonder, range(1, int(input())+1)))
print(ans)