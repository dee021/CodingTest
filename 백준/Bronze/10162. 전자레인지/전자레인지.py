ans = [0 for _ in range(2)] # A, B 버튼 조작 횟수
time = int(input())
ans[0], time = time//300, time%300
ans[1], time = time//60, time%60
print(-1) if time%10 else print(*ans, time//10) 