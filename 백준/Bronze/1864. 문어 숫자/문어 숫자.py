num = {'-': '0','\\':'1','(':'2','@': '3','?':'4','>':'5','&': '6','%': '7', '/':'-1', '#':False}

while True:
    n = [num[k] for k in input()][::-1]
    ans = 0
    if not n[0]:
        break
    for i in range(len(n)):
        ans += int(n[i])*8**i
    print(ans)