def reduce(num):
    
    if num==0:
        return 0
    reduce_num = reduce(num//10)
    digit=num%10
    if digit==0:
        return reduce_num
    else:
        ans= reduce_num*10+digit
    return ans 

num=int(input("enter your number: "))
if num>0:
    print(f"reduce({num})  =>  {reduce(num)}")
if num<0:
    print(f"reduce({num})  =>  {-reduce(-num)}")
