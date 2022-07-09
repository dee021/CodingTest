import sys

n = int(input())
global num, txt
num = 1
txt =''
stack = []
no = 0

def push(a, st):
    global num, txt
    st.extend([x for x in range(num,a+1,1)])
    k = a-num+1
    num = a+1
    txt += '+\n'*k

def stPop(a, st):
    global txt
    while a != st.pop():
        txt += '-\n'
    txt += '-\n'

for i in range(n):
    m = int(sys.stdin.readline())
    
    while no == 0:
        if m >= num:
            push(m, stack)
            stPop(m, stack)
            break
        elif m in stack:
            stPop(m, stack)
            break
        else:
            no = 1

sys.stdout.write(txt) if no == 0 else print('NO')
