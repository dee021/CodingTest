import sys
input = sys.stdin.readline

fibo = [1, 2]
l = [0 for _ in range(102)]
for i in range(1000):
    fibo.append(fibo[i]+fibo[i+1])
    if not l[len(str(fibo[-1]))]:
        l[len(str(fibo[-1]))] = len(fibo) -1
    if fibo[-1] > 10**100:
        fibo.pop()
        break
l[1] = 0

while True:
    a, b = map(int, input().split())
    if a == 0 == b:
        break
    ans = 0
    for i in range(l[len(str(a))], l[min(len(str(b))+1, len(l)-1)]):
        if a <= fibo[i] <= b:
            ans += 1
        elif fibo[i] > b:
            break
    print(ans)