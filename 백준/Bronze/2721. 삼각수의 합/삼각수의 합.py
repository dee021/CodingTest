ans = [x*(x+1)*(x+2)//2 for x in range(1, 301)]

for _ in range(int(input())):
    n = int(input())
    print(sum(ans[:n]))