a, b, c = map(int, input().split())
arr = [0 for _ in range(101)]
for _ in range (3):
    s, e = map(int, input().split())
    for t in range(s, e):
        arr[t] += 1
arr = arr.count
print(arr(1)*a + arr(2)*b*2 + arr(3)*c*3)