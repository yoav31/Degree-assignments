def fun(num1, num2, num3):
    first=max(num1, num2, num3)

    if first==num1:
        second=max(num2,num3)
        return first*second
    
    elif first==num2:
        second=max(num1,num3)
        return first*second

    else:
        second=max(num1,num2)
        return first*second  

num1=int(input("enter number one:"))
num2=int(input("enter number two:"))
num3=int(input("enter number three:"))
answer=fun(num1,num2,num3)
print(f"answer={answer}")