def solution(nums):
    isPrime = []
    for i in range(len(nums)):
        for j in range(i+1,len(nums)):
            for z in range(j+1,len(nums)):
                isPrime.append(nums[i]+nums[j]+nums[z])
    
    n = max(isPrime)
    prime = [x for x in range(2, n+1) if x == 2 or x%2]

    for i in range(len(prime)):
        if i >= len(prime) or prime[i] > n**0.5 + 1:
            break
        p = prime[i]
        for j in prime[i+1:]:
            if j%p == 0:
                prime.remove(j)

    return len([x for x in isPrime if x in prime])