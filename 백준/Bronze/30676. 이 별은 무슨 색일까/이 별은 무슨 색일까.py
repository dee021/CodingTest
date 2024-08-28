ld = [620, 590, 570, 495, 450, 425, 380]
color = ['Red', 'Orange', 'Yellow', 'Green', 'Blue', 'Indigo', 'Violet']
n = int(input())
for i in range(7):
    if n >= ld[i]:
        print(color[i])
        break