s = {0:'S', 1:'N', 2:'U'}
arr = []
for _ in range(3):
    p, w = map(int, input().split())
    p = p*10 if p < 500 else p*10 - 500
    w *= 10
    arr.append(w/p)
print(s[arr.index(max(arr))])