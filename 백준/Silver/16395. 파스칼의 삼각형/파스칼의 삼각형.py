import math
def intInput(num):
    return int(num) -1
n, r = map(intInput, input().split())
n = math.factorial(n)/math.factorial(n-r)
r = math.factorial(r)
print(int(n/r))