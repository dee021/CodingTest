import sys
print = sys.stdout.write

def isAns(num):
    global mem
    path = set()
    while num != 1 and num not in path:
        if num in mem:
            mem = mem.union(path)
            return True
        path.add(num)
        temp = 0
        for i in str(num):
            temp += int(i)**2
        num = temp
    if num == 1:
        mem = mem.union(path)
        return True
    return False

mem = set()
n = int(input())
nums = [1 if x % 2 else 0 for x in range(n+1)]
nums[1] = 0
prime = []
for p in range(3, n+1, 2):
    if not nums[p]:
        continue
    prime.append(p)
    if p**2 <= n+1:
        for k in range(p*p, n+1, p):
            if k > n:
                break
            nums[k] = 0

for i in prime:
    if isAns(i):
        print(str(i)+'\n')