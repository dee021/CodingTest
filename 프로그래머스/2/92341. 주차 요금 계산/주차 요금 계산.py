from math import ceil
conv = lambda x, y:60*int(x) + int(y) 

def solution(fees, records):
    BASE_TIME, BASE_FEE, UNIT_TIME, UNIT_FEE = fees
    cars = {}

    for record in records:
        time, no, io = record.split()
        cars.setdefault(no, []).append(conv(*time.split(':')))

    answer = []
    for no in sorted(cars.keys()):
        if len(cars[no]) % 2:
            cars[no].append(conv(*'23:59'.split(':')))
        m = 0
        for i in range(len(cars[no])//2):
            m += cars[no][i*2+1] - cars[no][i*2]
        answer.append(BASE_FEE + (ceil((m - BASE_TIME)/UNIT_TIME) * UNIT_FEE if m > BASE_TIME else 0))

    return answer
