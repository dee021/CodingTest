n = int(input())
ans = input()
print(len(ans)-ans.count('LL')+1) if ans.count('LL') > 0 else print(len(ans))
