


def exp (u, m):
    if (u == [0]):
        return [0]
    else:
        return ([0] * m) + u

def div (u, m):
    if (len(u) < m):
        u.append(0)
    return u[m : len(u)]

def rem (u, m):
    if(len(u) < m):
        u.append(0)
    return u[0: m]   


# u X v  567.832 X 9,423,723

u = [2, 3, 8, 7, 6, 5]
v = [3, 2, 7, 3, 2, 4, 9]

print(exp(v, 4)[::-1])   # 9423723 X 10**4
print(div(v, 4)[::-1])   # 9423723 // 10**4
print(rem(v, 4)[::-1])   # 9423723 % 10**4 
