# We can return more than one variable
def swap(a, b)
    return b, a
end

x = 10
y = 15
print x, " ", y, "\n" # Brackets may not be used
x, y = swap x, y
print(x, " ", y, "\n") # It's equivalent to previous 'print' 