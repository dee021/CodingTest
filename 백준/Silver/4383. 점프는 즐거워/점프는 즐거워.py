import sys
input = sys.stdin.readline

while True:
    try:
        n, *arr = map(int, input().split())
    except:
        break
    s = set(range(1, n))
    for i in range(n-1):
        s.discard(abs(arr[i] - arr[i+1]))
    print(s and 'Not jolly' or 'Jolly')