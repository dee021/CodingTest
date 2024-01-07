def solution(numbers):
    big = int(''.join(sorted(numbers, key = lambda x:-ord(x))))
    # big = 3
    cnt = numbers.count
    prime = [1 if x % 2 else 0 for x in range(big +1)]
    prime[1] = 0
    answer = int(bool(cnt('2')))
    
    for p in range(3, big+1, 2):
        if not prime[p]:
            continue
        for n in set(str(p)):
            if cnt(n) < str(p).count(n):
                break
        else:
            answer += 1
        if p**2 > big:
            continue
        for k in range(2, big):
            if p*k > big:
                break
            prime[p*k] = 0
    return answer