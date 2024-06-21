def sol(visited, used):
    global ans
    
    if visited == ALLVISITED:
        ans = 'YES'
        return

    for d in range(4):
        for c in range(len(word)):
            if (used & (1 << d)) == 0 == (visited & (1 << c)) and (word[c] in dice[d]):
                sol(visited | (1<<c), used | (1<<d))
                if ans == 'YES':
                    return

n = int(input())
dice = [set(input().strip()) for _ in range(4)]
for _ in range(n):
    word = input().strip()
    ALLVISITED = (1 << len(word)) - 1
    ans = 'NO'
    sol(0,0)
    print(ans)