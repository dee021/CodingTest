def calculate(oper, num1, num2):
    if oper == 0:
        return num1 + num2
    elif oper == 1:
        return num1 - num2
    elif oper == 2:
        return num1 * num2
    elif num1 < 0:
        return -(abs(num1)//num2)
    return num1//num2

def sol(level, res):
    global min_ans, max_ans
    if level == n-1:
        min_ans = min(min_ans, res)
        max_ans = max(max_ans, res)
        return

    for i in range(4):
        if operator[i] > 0:
            operator[i] -= 1
            sol(level+1, calculate(i, res, nums[level+1]))
            operator[i] += 1

min_ans = float('inf')
max_ans = -float('inf')
n = int(input())
nums = list(map(int, input().split()))
operator = list(map(int, input().split()))

sol(0, nums[0])
print(max_ans, min_ans, sep='\n')