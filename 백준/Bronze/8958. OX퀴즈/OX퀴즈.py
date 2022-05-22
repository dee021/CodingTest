n=int(input())
for i in range(n):
    score=0;count=0;
    temp=input()
    for j in temp:
        if j == 'O':
            count+=1
            score += count
        else:
            count=0
    print(score)
