import sys
input = sys.stdin.readline

output = [' is NOT surprising.',' is surprising.']
while True:
    string = input().strip()
    if string == '*':
        break
    l = len(string)
    d, ans = 1, 1
    while d <= l-1:
        s = set()
        for idx in range(l-d):
            tmp = string[idx] + string[idx+d]
            if tmp in s:
                ans = 0
                break
            s.add(tmp)
        if not ans:
            break
        d += 1
    print(string + output[ans])