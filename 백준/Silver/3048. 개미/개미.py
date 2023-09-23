a, b = map(int, input().split())
x, y = input(), input()
x += ' '*(b)
y += ' '*(a)
x = x[::-1]
t = int(input())

if t >= a+b-1:
    ans = y+x
else:
    arr = list(x+y); pv = a+b
    for i in range(1, t+1):
        idx = pv - i
        for _ in range(i):
            arr[idx], arr[idx+1] = arr[idx+1], arr[idx]
            idx += 2
    ans = ''.join(arr)
print(ans.replace(' ', ''))