def avg(lst):
    return sum(lst)/len(lst)

n, l, h = map(int, input().split())
s = sorted(list(map(int, input().split())))
print(avg(s[l:n-h]))