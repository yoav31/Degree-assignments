def digits():
    num=int(input("enter your number: "))
    digits=len(str(num))

    if digits==1:
        if num%2==0:
            print(f"digits({num})  =>   one digit   -even")
        else:
            print(f"digits({num})  =>   one digit   -odd")   

    elif digits==2:
        temp=num
        sum_digits=num%10
        num=num//10
        sum_digits+=num%10
        if sum_digits%2==0:
            print(f"digits({temp})  =>    two digit   -even")
        else:
            print(f"digits({temp})  =>   two digit   -odd")   

    elif digits==3:
        temp=num
        sum_digits=num%10
        num=num//10
        num=num//10
        sum_digits+=num%10
        if sum_digits%2==0:
            print(f"digits({temp})  =>    three digit   -even")
        else:
            print(f"digits({temp})  =>   three digit   -odd")

    elif digits==4:
        temp=num
        num=num//10
        sum_digits=num%10
        num=num//10
        sum_digits+=num%10
        if sum_digits%2==0:
            print(f"digits({temp})  =>    four digit   -even")
        else:
            print(f"digits({temp})  =>   four digit   -odd")

    elif digits==5:
        temp=num
        num=num//10
        num=num//10
        sum_digits=num%10
        if sum_digits%2==0:
            print(f"digits({temp})  =>    five digit   -even")
        else:
            print(f"digits({temp})  =>   five digit   -odd")         


digits()            