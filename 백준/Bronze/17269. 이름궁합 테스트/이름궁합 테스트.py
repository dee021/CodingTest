arr = [3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]
d = {chr(ord('A')+i):arr[i] for i in range(26)}

n, m = map(int, input().split())
a, b = input().split()
lst = []; l = n+m-1

for i in range(min(n, m)):
    lst.extend([d[a[i]], d[b[i]]])
if n != m:
    lst.extend(list(map(lambda x: d[x], a[m:] if n > m else b[n:])))

while l > 1:
    lst = [(lst[i]+lst[i+1])%10 for i in range(l)]
    l -= 1
    
print(lst[0]*10+lst[1], '%', sep='')