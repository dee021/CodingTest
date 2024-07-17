def sol(idx):
    start = max(1, idx - k)
    end = min(n, idx + k)
    for i in range(start-1, end):
        virus[i] = 1

n, m, k = map(int, input().split())
init = list(input().strip())
virus = [0 for _ in range(n)]

for i in range(n):
    if init[i] == 'R':
        sol(i+1)

print(sum(virus) <= m and 'Yes' or 'No')