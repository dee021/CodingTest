require = list(map(int, input().split()))
have = list(map(int, input().split()))
x = min([require[i]/have[i] for i in range(3)])
ans = [require[i]-have[i]*x for i in range(3)]
print(*ans)