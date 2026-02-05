def correctNumber(num):
    
    if Grate(len(str(num)),3):
        return False
    elif Less(len(str(num)),3):
        return False
    else:
        if Eq(0,num%2):
            num=num//10
            if Eq(0,num%2):
                num=num//10
                if Eq(0,num%2):
                    return True  
        else:
            num=num//10
            if Eq(1,num%2):
                num=num//10
                if Eq(1,num%2):
                    return True
        return False  

          

def Eq(num1,num2):
    return num1 == num2
def Grate(num1, num2):
    if num1>num2:
        return True
    return False
def Less(num1,num2):
    if num1<num2:
        return True
    return False

        
num=int(input("enter your number: "))
print(f"correctNumber({num}) => {correctNumber(num)}") 




                
                