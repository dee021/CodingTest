import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
k = int(input())
dp = [[0 for _ in range(nums[-1]+1)]] # [total_cnt, cnt_of_num1, ...]
number = 0
while True:
    number += 1
    for num in nums[::-1]:
        if num > number:
            continue
        
        if dp[number-num][0] < k:
            dp.append(dp[number-num].copy())
            dp[number][num] += 1
            dp[number][0] = dp[number-num][0] + 1
            break
    else:
         print('{} win at {}'.format(['holsoon', 'jjaksoon'][number%2], number))
         break