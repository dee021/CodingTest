n = int(input())
word=[]

for i in range(n):
    temp = input()
    word.append([len(temp),temp])
    

word.sort()

temp=''
for i in range(len(word)):
    if temp != word[i][1]:
        temp = word[i][1]
        print(word[i][1])
