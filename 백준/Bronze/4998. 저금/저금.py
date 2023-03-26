import sys
input = sys.stdin.readline
import math
E = math.e

while True:
    try:
        n, b, m = map(float, input().split())
    except:
        break
    b = b/100
    print(math.ceil(math.log(m/n, E)/math.log(1+b, E)))