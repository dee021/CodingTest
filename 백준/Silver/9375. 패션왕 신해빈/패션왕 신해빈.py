import sys
n = int(input())

def plusOne(m):
    return m+1
        
for i in range(n):
    d = dict();l = list();
    m = int(sys.stdin.readline())
    for j in range(m):
        a, b = sys.stdin.readline().strip().split()
        if b in d:
            d[b] += 1
        else:
            d[b] = 2

    case = 1
    for i in d:
        case *= d[i]
    case -= 1
    
    print(case)
    