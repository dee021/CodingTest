for _ in range(int(input())):
    q, a = input().split('=')
    print(eval(q)==int(a) and 'correct' or 'wrong answer')