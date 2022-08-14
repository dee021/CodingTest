def ans(num):
    global year, arr
    year += num
    arr = list(map(lambda x : x - num, arr))
    if 0 == arr[0]:arr[0] = 15
    if 0 == arr[1]:arr[1] = 28
    if 0 == arr[2]:arr[2] = 19

year = 0
arr = list(map(int, input().split()))

while not (arr[0]==arr[1] and arr[1]==arr[2]):
    ans(min(arr))
print(year+arr[0])