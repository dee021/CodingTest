k = int(input())
a, b, c, d = map(int, input().split())

func1 = a*k+b
func2 = c*k+d
if func1 == func2:
    print('Yes', func1)
else:
    print('No')