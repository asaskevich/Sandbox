# We can return more than one variable
def swap(a, b):
    return b, a

x = 14
y = 16
print(x, y)
# It's simple!
x, y = swap(x, y)
print(x, y)
