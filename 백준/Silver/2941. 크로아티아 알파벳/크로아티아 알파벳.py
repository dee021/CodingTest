stt=('dz=','c=','c-','d-','lj','nj','s=','z=')

string=input()
count = 0

for i in stt:
    while string.find(i)!=-1:
        count+=1
        string=string.replace(i,'.',1)
string=string.replace('.','')
print(len(string)+count)