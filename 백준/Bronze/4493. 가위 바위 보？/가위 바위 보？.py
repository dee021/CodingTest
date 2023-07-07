import sys
input = sys.stdin.readline

s = 'RPS'*2
for _ in range(int(input())):
    ans = [0,0]
    for _ in range(int(input())):
        x = input().strip().replace(' ', '')
        if x[0] != x[1]:
            ans[bool(s.count(x))] += 1
    print(['Player 1','Player 2'][ans[0] < ans[1]] if len(set(ans)) > 1 else 'TIE')