month = int(input())
if month == 2:
    day = int(input())
    if day < 18:
        print('Before')
    else:
        print(day == 18 and 'Special' or 'After')
else:
    print(month < 2 and 'Before' or 'After')
    exit()