import sys

def openOrClose(num):
    temp = [x for x in range(2, num+1) if num%x == 0] # num의 약수
    return (len(temp)+1)%2 # 0 : 닫힘, 1 : 열림

t = int(input())
for i in range(t):
    room = [x for x in range(2,int(sys.stdin.readline())+1)]
    room = list(map(openOrClose, room))
    print(sum(room) + 1) # room no.1을 더하여 출력
