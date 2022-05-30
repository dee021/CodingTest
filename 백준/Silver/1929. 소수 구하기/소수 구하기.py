m,n = map(int,input().split())

# 1 제외
if m==1:
    m+=1

# 구간 [2,n] 범위의 값을 갖는 리스트
ran = [x for x in range(2,n+1,1) if (x%2)!=0 or x==2]

# 리스트 안의 소수 구하기
for i in ran:
    if i in ran:
        ran = [x for x in ran if (x%i)!=0 or x==i]
        if i >= int(ran[len(ran)-1]**0.5):
            break

# 입력 받은 구간의 소수 출력
for i in ran:
    if i >= m:
        print(i) 