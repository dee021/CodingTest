arr = [chr(x) for x in range(65, 70)]

for _ in range(3):
    b = input().split().count('0') - 1
    print(arr[b])