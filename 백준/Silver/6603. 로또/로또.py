from itertools import combinations as cb
nums = input()
while True:
    for res in list(cb(list(map(int, nums.split()))[1:],6)):
        print(*res)
        
    nums = input()
    if nums == '0':
        break
    print()