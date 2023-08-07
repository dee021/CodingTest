n, p = map(int, input().split())
m = n
lst = list()
while m not in lst:
    lst.append(m)
    m = m*n%p
print(len(lst)-lst.index(m))