korea = [0]*5
for c in input().strip():
    i = 'KOREA'.index(c)
    if i == 0 and korea[0] == korea[-1]:
        korea[i] += 1
    elif korea[i-1] == korea[i]+1:
        korea[i] += 1
        
print(sum(korea))