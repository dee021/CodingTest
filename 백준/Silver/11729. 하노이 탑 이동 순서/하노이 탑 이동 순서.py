from sys import stdout as st
path = []

def movePole(num, one, two, three, p):
    if num != 1:
        movePole(num-1, one, three, two, p)
        p.append([one, three])
        movePole(num-1, two, one, three, p)
    else:
        p.append([one, three])
        
n = int(input())

movePole(n, 1, 2, 3, path)
st.write(str(len(path))+'\n')
for i in path:
    st.write(str(i[0])+' '+str(i[1])+'\n')