import sys
input = sys.stdin.readline
print = sys.stdout.write

s = set(
'H He\
 Li	Be	 	 	 	 	 	 	 	 	 	 	B	C	N	O	F	Ne\
 Na	Mg	 	 	 	 	 	 	 	 	 	 	Al	Si	P	S	Cl	Ar\
 K	Ca	Sc	Ti	V	Cr	Mn	Fe	Co	Ni	Cu	Zn	Ga	Ge	As	Se	Br	Kr\
 Rb	Sr	Y	Zr	Nb	Mo	Tc	Ru	Rh	Pd	Ag	Cd	In	Sn	Sb	Te	I	Xe\
 Cs	Ba	Hf	Ta	W	Re	Os	Ir	Pt	Au	Hg	Tl	Pb	Bi	Po	At	Rn\
 Fr	Ra	Rf	Db	Sg	Bh	Hs	Mt	Ds	Rg	Cn	 	Fl	 	Lv	 	 \
	La	Ce	Pr	Nd	Pm	Sm	Eu	Gd	Tb	Dy	Ho	Er	Tm	Yb	Lu\
	Ac	Th	Pa	U	Np	Pu	Am	Cm	Bk	Cf	Es	Fm	Md	No	Lr'.lower().split())

for _ in range(int(input())):
    inputs = input().strip()
    dp = [0] * len(inputs)
    for i in range(len(inputs)):
        if inputs[i] in s:
            dp[i] = max(dp[i], dp[i-1] + 1)
        if i+1 < len(inputs) and inputs[i:i+2] in s:
            dp[i+1] = max(dp[i], dp[i-1]+2)

    if dp[-1] == len(inputs):
        print('YES\n')
    else:
        print('NO\n')