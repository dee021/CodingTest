import sys
n = int(input())

num = []
cnt = [0]*8001
for i in range(n):
    temp = int(sys.stdin.readline())
    num.append(temp)
    cnt[temp+4000] +=1

avg = round(sum(num)/n)# 평균
num.sort()
med = num[int(n/2)] # 중앙값

maxcnt=max(cnt);temp = []
flag = True
while flag:
    idx = cnt.index(max(cnt))
    cnt[idx] = 0
    temp.append(idx-4000)
    if maxcnt > max(cnt):
        flag = False

temp.sort()
mod = temp[0] if len(temp)==1 else temp[1] #최빈값


ran = max(num) - min(num) # 범위
print(avg,med,mod,ran,sep='\n')
