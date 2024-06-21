for i in range(3, 0, -1):
    tmp = input().strip()
    if tmp.isnumeric():
        ans = int(tmp) + i
        t, f = ans%3, ans%5
        if not t and not f:
            ans = 'FizzBuzz'
        elif not t and f:
            ans = 'Fizz'
        elif t and not f:
            ans = 'Buzz'
        print(ans)
        break