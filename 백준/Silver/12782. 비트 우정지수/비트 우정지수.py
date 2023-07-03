for _ in range(int(input())):
    a, b = input().split()
    cnt, st = abs(a.count('1')-b.count('1')), sum([1 for i in range(len(a)) if a[i]!= b[i]])
    ans = st-(st-cnt)//2 if st > cnt else st
    print(ans)