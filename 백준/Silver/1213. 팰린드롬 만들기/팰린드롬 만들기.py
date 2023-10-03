def sol(name):
    cnt = name.count
    s, e = 0, len(name)-1
    arr = ['' for _ in range(e+1)]
    c = ord('A')
    while s < e or not arr[(s+e)//2]:
        l = cnt(chr(c))
        if not l:
            c += 1
            continue
        else:
            arr[s:s+l//2] = [chr(c)]*(l//2)
            arr[e-l//2+1:e+1] = [chr(c)]*(l//2)
            if l%2:
                if arr[(s+e)//2]:
                    return "I'm Sorry Hansoo"
                arr[(s+e)//2] = chr(c)
        c += 1
        s += l//2
        e -= l//2
    return ''.join(arr)

print(sol(input()))