import sys
input = sys.stdin.readline

number = ['0111111','0001010','1011101', '1001111','1101010','1100111','1110111','0001011','1111111','1101011']
num = {}
for x in range(10):
    num['%03d' %int(number[x], 2)] = str(x)
    number[x] = '%03d' %int(number[x], 2)

while True:
    value = input().strip().strip('=')
    if value == 'BYE':
        break
    oper = ''
    for k in value.split('+'):
        tmp = ''
        for i in range(0,len(k), 3):
            tmp += num[k[i:i+3]]
        if oper:
            oper += '+'
        oper += tmp
    print('{}={}'.format(value, ''.join([number[int(x)] for x in str(eval(oper))])))