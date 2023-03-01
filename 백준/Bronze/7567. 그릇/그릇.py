b, *s = input()
ans = [0,0]
for a in s:
    if b == a:
        ans[0] += 1
    else:
        ans[1] += 1
    b = a
print(10+ans[0]*5+ans[1]*10)