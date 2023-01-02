for _ in range(int(input())): # test case
    input()
    candy = 0
    s = int(input())
    for _ in range(s):
        candy += int(input())
    print(candy%s and 'NO' or 'YES')