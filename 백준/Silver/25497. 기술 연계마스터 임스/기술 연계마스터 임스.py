s = {'L':0, 'S':0}
n = int(input())
ans = 0
for sk in input():
    if sk.isalpha():
        if sk in ['L', 'S']:
            s[sk] += 1
            continue
        else:
            l = ['L','S'][sk=='K']
            if s[l] > 0:
                s[l] -= 1
                ans += 1
            else:
                break
    else:
        ans += 1       
print(ans)