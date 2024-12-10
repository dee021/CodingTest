import sys
input = sys.stdin.readline

for _ in range(int(input())):
    string = input().strip().count
    ans, cnt = '', 0
    for c in range(ord('a'), ord('z')+1):
        if (tmp:=string(chr(c))) > cnt:
            cnt = tmp
            ans = chr(c)
        elif tmp == cnt:
            ans += chr(c)
    print(len(ans) > 1 and '?' or ans)