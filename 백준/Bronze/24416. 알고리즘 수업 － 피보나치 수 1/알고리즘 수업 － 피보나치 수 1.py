n = int(input())
global cnt
cnt = 0

def fibo(num):
    global cnt
    fibolist = [0]*num
    fibolist[0] = fibolist[1] = 1
    for i in range(2, num):
        cnt = cnt + 1
        fibolist[i] = fibolist[i-1] + fibolist[i-2]
    return [fibolist[num-1], cnt]

print(' '.join([str(x) for x in fibo(n)]))