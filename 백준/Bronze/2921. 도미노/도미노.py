n = int(input())
print(n*(n+1)*(n+2)//2)

'''
sol)
0 < t <= n인 t가 한 칸에 꼭 들어갈 때의 점의 개수는 t부터 2t까지의 합
=>
sigma(sigma(2t)-sigma(t))
= 3/2 * sigma(t**2 + t)
= 3/2 * (n*(n+1)(2n+1)/6 + n*(n+1)/2)
= n*(n+1)*(n+2)/2
'''