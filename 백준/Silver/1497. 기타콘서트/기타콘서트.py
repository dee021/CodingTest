def conv(psb):
    temp = ''
    for i in range(m):
        if psb[i] == 'Y':
            temp += '1'
        else:
            temp += '0'
    return int(temp, 2)

def sol(idx, res, visited):
    global ans, cnt
    
    if cnt == bin(visited).count('1') and ans >= res:
        ans = res
    elif cnt < bin(visited).count('1'):
        cnt = bin(visited).count('1')
        ans = res
    
    if idx >= n:
        return
    
    sol(idx+1, res+1, visited|song[idx])
    sol(idx+1, res, visited)

ans, cnt = 11, 0
n, m = map(int, input().split())
song = [conv(input().split()[1]) for _ in range(n)]
sol(0,0,0)
print(ans != 11 and ans or -1)