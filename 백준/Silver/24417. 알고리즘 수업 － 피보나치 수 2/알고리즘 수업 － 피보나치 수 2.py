n = int(input())
a, b = 1,1

for i in range((n-1)//2):
    a = (a+b)%1000000007
    b = (a+b)%1000000007
    
print(n%2 and a or b, n-2) 