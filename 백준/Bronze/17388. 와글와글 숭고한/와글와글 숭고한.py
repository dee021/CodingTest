arr = ['Soongsil', 'Korea', 'Hanyang']
data = list(map(int, input().split()))

print(sum(data) >= 100 and 'OK' or arr[data.index(min(data))])