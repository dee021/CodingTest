import sys
input = sys.stdin.readline

while True:
    a = input().strip()
    if not int(a):
        break
    ans = set()
    ans.add(a)
    while True:
        a = str(int(a)**2)
        a = ('0'*(8-len(a)) + a)[2:6]
        if a in ans:
            break
        ans.add(a)
    print(len(ans))