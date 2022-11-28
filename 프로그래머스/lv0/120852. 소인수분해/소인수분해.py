def solution(n):
    answer = set()
    prime = [x for x in range(2, n+1) if x == 2 or x%2]
    while n-1:
        p = prime[0]
        for num in prime:
            if num%p == 0:
                prime.remove(num)
        while n%p ==0:
            n//=p
            answer.add(p)
    return sorted(list(answer))