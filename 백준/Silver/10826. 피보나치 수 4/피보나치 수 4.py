fibo = [0 for _ in range(int(input())+1)]
if len(fibo) > 1: fibo[1] = 1
for i in range(len(fibo)-2):
    fibo[i+2] = fibo[i] + fibo[i+1]
print(fibo[-1])