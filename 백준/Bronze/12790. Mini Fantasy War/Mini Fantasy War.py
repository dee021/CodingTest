for _ in range(int(input())):
    input_val = list(map(int, input().split()))
    print(max(1, input_val[0]+input_val[4])+5 * max(1, input_val[1]+input_val[5]) + 2 * max(0, input_val[2]+input_val[6]) + 2 * (input_val[3]+input_val[7]))