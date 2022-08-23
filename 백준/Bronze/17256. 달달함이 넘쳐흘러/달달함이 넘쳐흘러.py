class Cake:
    x = 0
    y = 0
    z = 0
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
    def cakeOper(self, res):
        print(res.x - self.z, int(res.y/self.y), res.z - self.x)

x, y, z = map(int, input().split())
a = Cake(x, y, z)
x, y, z = map(int, input().split())
c = Cake(x, y, z)
a.cakeOper(c)