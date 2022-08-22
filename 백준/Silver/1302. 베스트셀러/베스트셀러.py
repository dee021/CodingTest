books = {}

for i in range(int(input())):
    name = input()
    books[name] = books[name] + 1 if name in books else 1
print([x[0] for x in sorted(books.items(),key=lambda x : (-x[1], x[0]))][0])
