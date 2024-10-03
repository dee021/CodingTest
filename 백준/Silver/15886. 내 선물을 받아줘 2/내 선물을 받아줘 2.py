def path(index):
    s = set()
    while 0 <= index < n:
        if visited[index]:
            if index not in s:
                return 0
            return 1
        visited[index] = 1
        s.add(index)
        if way[index] == 'E':
            index += 1
        else:
            index -= 1
    return 1

n = int(input())
visited = [0 for _ in range(n)]
way = input().strip()
ans = 0

for i in range(n):
    ans += path(i)
print(ans)