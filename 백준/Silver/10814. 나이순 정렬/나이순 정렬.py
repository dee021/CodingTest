import sys
import time

n = int(input())
customer=[]

for i in range(n):
    age,name=sys.stdin.readline().split()
    age = int(age)
    customer.append([age,time.time(),name])

customer.sort()

for i in range(n):
    print('{0} {1}'.format(customer[i][0],customer[i][2]))
