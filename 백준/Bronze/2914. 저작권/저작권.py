# i = (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수) + x
#   = ans / a + x (0 <= x < 1)
# <=> ans = (i-x)a
# <=> min_ans > (i-1)*a = i*a - a

a, i = map(int, input().split())
print(i*a-a+1)