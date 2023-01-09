while True:
    ans, carry = 0, 0
    a, b = input().split()
    if a == '0' == b:
        break
    if len(a) > len(b):
        b = '0'*(len(a)-len(b)) + b
    elif len(a) < len(b):
        a = '0'*(len(b)-len(a)) + a
    b = b[::-1]
    for i, n in enumerate(a[::-1]):
        x = int(n)
        y = int(b[i]) + 1 if carry else int(b[i])
        if x + y > 9:
            ans += 1
            carry = 1
        else:
            carry = 0
    print(ans)