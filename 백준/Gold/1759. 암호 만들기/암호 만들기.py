def sol(idx, cnt, res):
    if cnt == l:
        tmp = [x for x in 'aeiou' if x in res]
        if tmp and cnt-len(tmp) >= 2:
            print(res)
        return
    
    if idx >= c:
        return
    
    sol(idx+1, cnt+1, res + alpha[idx])
    sol(idx+1, cnt, res)

l, c = map(int, input().split())
alpha = sorted(input().strip().split())
sol(0,0,'')