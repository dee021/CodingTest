score = 0
rsp = ['R', 'P', 'S']
r = int(input()) 
arr = [[0,0,0] for _ in range(r)]
sang = input() 
f = int(input()) 

for i in range(f): # 상근이의 점수
    for j, x in enumerate(input()): 
        if x == 'R':
            arr[j][0] += 1
        elif x == 'P':
            arr[j][1] += 1
        else:
            arr[j][2] += 1
        
        if sang[j] == x: # 비긴 경우
            score += 1
        else:
            if x == rsp[rsp.index(sang[j])-1]:
                score += 2
print(score)
score = 0

for i in range(r): # 최대 점수
    S = arr[i][1] * 2 + arr[i][2] # 가위를 내는 경우
    P = arr[i][0] * 2 + arr[i][1] # 보를 내는 경우
    R = arr[i][2] * 2 + arr[i][0] # 바위를 내는 경우
    score += max([S, P, R])

print(score)