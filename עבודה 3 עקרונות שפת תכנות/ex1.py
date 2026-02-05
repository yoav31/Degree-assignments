def make_power(b, p):
    def menu(order):
        if order == "base":
            return b
        if order == "power":
            return p
        if order == "print_power":
            return f"{b}^{p}"
        if order == "calc_power":
            return b ** p
        if order == "mul_power":
            return mul_power
        if order == "div_power":
            return div_power
        if order == "improve_power":
            num=2
            base = b
            power = p
            if num <= base//2 and base//num!=1 :  #בהתחלה אם המספר הוא בחזקת 1
                if base%num==0:                #צריך להכפיל את החזקה ב2
                    base //= num
                    power *= 2
                else:
                    num+=1    
            while num <= base//2 and base//num!=1 :
                if base%num==0:
                    base //= num
                    power += 1
                else:
                    num+=1    
            return make_power(base, power)
    return menu

def base(func):
    return func("base")

def power(func):
    return func("power")

def print_power(func):
    print(func("print_power"))

def calc_power(func):
    return func("calc_power")

def mul_power(func1, func2):
    res=func1("calc_power")*func2("calc_power")
    return make_power(res,1)("improve_power")

def div_power(func1, func2):
    return func1("div_power")(func2)

def improve_power(func):
    return func("improve_power")

# דוגמת הרצה:
x = make_power(4, 5)
print(x)  # Should show function address

print(base(x))  # Should print 4
print(power(x))  # Should print 5

print_power(x)  # Should print 4^5

print_power(improve_power(x))  # Should print 2^10

print_power(mul_power(improve_power(x), make_power(2, 5)))  # Should print 2^15

# y = make_power(9, 2)
# print_power(improve_power(y))  # Should print 3^4

# print_power(mul_power(x, y))  # Should print 4^5 * 9^2 = 82944
# print_power(mul_power(improve_power(y), make_power(3, 5)))  # Should print 3^9
# print_power(div_power(improve_power(y),make_power(3,5)))
# print_power(div_power(mul_power(make_power(2,3),make_power(2,8)), make_power(2,4)))
# print_power(div_power(mul_power(improve_power(make_power(8,1)), improve_power(make_power(256,1))),improve_power(make_power(16,1))))
# print_power(make_power(12,1))
# print_power(make_power(12,0))
