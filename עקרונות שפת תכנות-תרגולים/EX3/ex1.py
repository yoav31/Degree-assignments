def rec(x):
    if x==0:
        return x
    return x+rec(x-1)

num=int(input("number: "))
sum=rec(num)
print(f"the sum is:{sum}")