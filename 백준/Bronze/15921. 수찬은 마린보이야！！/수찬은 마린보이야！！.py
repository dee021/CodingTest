n = int(input())
if not n:
    print('divide by zero')
    exit(0)

arr = list(map(int, input().split()))
mean = sum(arr)/n
e = 0
for i in set(arr):
    e += i*arr.count(i)/n

print('%.2f' %(mean/e) if e else 'divide by zero')
