import sys
n = int(input())
        
for i in range(n):
    d = dict();l = list();
    m = int(sys.stdin.readline())
    for j in range(m):
        a, b = sys.stdin.readline().strip().split()
        if b in d:
            d[b] += 1
        else:
            d[b] = 2
    # case = (a_1+1)*(a_2+1)*...*(a_len(d)+1) - 1
    case = 1
    for i in d:
        case *= d[i]
    case -= 1
    
    print(case)